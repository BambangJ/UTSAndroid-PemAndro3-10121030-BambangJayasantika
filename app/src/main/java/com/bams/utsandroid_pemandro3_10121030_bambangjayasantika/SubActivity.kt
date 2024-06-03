package com.bams.utsandroid_pemandro3_10121030_bambangjayasantika
//10121030-Bambang Jayasantika-3 Juni 2024
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SubActivity : AppCompatActivity() {
    private var customDialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val intent = intent
        val intent2 = Intent(
            this,
            MainActivity::class.java
        )

        val tes = intent.getStringExtra(MainActivity.EXTRA_TES)
        val tglkon = intent.getStringExtra(MainActivity.EXTRA_TGLKON)
        val nik = intent.getStringExtra(MainActivity.EXTRA_NIK)
        val nama = intent.getStringExtra(MainActivity.EXTRA_NAMA)
        val jk = intent.getStringExtra(MainActivity.EXTRA_KELAMIN)
        val tgl = intent.getStringExtra(MainActivity.EXTRA_TGL)
        val hub = intent.getStringExtra(MainActivity.EXTRA_HUBUNGAN)

        val tvTes = findViewById<TextView>(R.id.j_tes)
        val tvTglKon = findViewById<TextView>(R.id.j_tglkon)
        val tvNik = findViewById<TextView>(R.id.j_nik)
        val tvNama = findViewById<TextView>(R.id.j_nama)
        val tvTgl = findViewById<TextView>(R.id.j_tgl)
        val tvHub = findViewById<TextView>(R.id.j_hub)
        val tvJk = findViewById<TextView>(R.id.j_jk)
        val btn_simpan = findViewById<Button>(R.id.btn_simpan)
        val btn_ubah = findViewById<Button>(R.id.btn_ubah)



        tvTes.text = tes
        tvTglKon.text = tglkon
        tvNik.text = nik
        tvNama.text = nama
        tvTgl.text = tgl
        tvJk.text = jk
        tvHub.text = hub
        initCustomDialog()

        btn_simpan.setOnClickListener { customDialog!!.show() }

        btn_ubah.setOnClickListener {
            intent2.putExtra(EXTRA_TES, tes)
            intent2.putExtra(EXTRA_TGLKON, tglkon)
            intent2.putExtra(EXTRA_STATUS, "ubah")
            intent2.putExtra(EXTRA_NIK, nik)
            intent2.putExtra(EXTRA_NAMA, nama)
            intent2.putExtra(EXTRA_TGL, tgl)
            intent2.putExtra(EXTRA_KELAMIN, jk)
            intent2.putExtra(EXTRA_HUBUNGAN, hub)
            startActivity(intent2)
        }
    }

    private fun initCustomDialog() {
        customDialog = Dialog(this@SubActivity)
        customDialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        customDialog!!.setContentView(R.layout.activity_success)
        customDialog!!.setCancelable(true)


        val btnBack = findViewById<ImageButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            val mainActivity = Intent(
                applicationContext,
                MainActivity::class.java
            )
            startActivity(mainActivity)
        }

        val btnok = customDialog!!.findViewById<Button>(R.id.btn_ok)
        btnok.setOnClickListener { customDialog!!.dismiss() }
    }

    companion object {
        const val EXTRA_NAMA: String = "nama"
        const val EXTRA_NIK: String = "nik"
        const val EXTRA_TGL: String = "tgl"
        const val EXTRA_KELAMIN: String = "kelamin"
        const val EXTRA_HUBUNGAN: String = "hubungan"
        const val EXTRA_STATUS: String = "status"
        const val EXTRA_TES: String = "tes"
        const val EXTRA_TGLKON: String = "tglkon"
    }
}