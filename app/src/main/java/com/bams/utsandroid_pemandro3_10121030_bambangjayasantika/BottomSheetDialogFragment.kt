package com.bams.utsandroid_pemandro3_10121030_bambangjayasantika

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class CustomBottomSheetDialogFragment : BottomSheetDialogFragment() {

    interface OnOkClickListener {
        fun onOkClicked()
    }

    private var listener: OnOkClickListener? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = context as? OnOkClickListener
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_ok)?.setOnClickListener {
            listener?.onOkClicked()
            dismiss()
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}

