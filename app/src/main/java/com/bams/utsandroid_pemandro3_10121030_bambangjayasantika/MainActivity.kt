package com.bams.utsandroid_pemandro3_10121030_bambangjayasantika
//10121030-Bambang Jayasantika-3 Juni 2024
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar


//10121030-Bambang Jayasantika-3 Juni 2024
class MainActivity : AppCompatActivity() {
    var date: EditText? = null
    var date2: EditText? = null
    var datePickerDialog: DatePickerDialog? = null
    var status: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent2 = intent
        status = intent2.getStringExtra(EXTRA_STATUS)

        val radioTes = findViewById<View>(R.id.opsites) as RadioGroup
        val radioSexGroup = findViewById<View>(R.id.opsiJK) as RadioGroup
        val radioHub = findViewById<View>(R.id.opsi) as RadioGroup
        val edtNik = findViewById<EditText>(R.id.edt_nik)
        val edtNama = findViewById<EditText>(R.id.edt_nama)
        val btn_lanjut = findViewById<Button>(R.id.btn_lanjut)


        date = findViewById<View>(R.id.edt_tglkon) as EditText
        date2 = findViewById<View>(R.id.edt_tgl) as EditText

        if (status !== "") {
            val tes = intent2.getStringExtra(EXTRA_TES)
            val tglkon = intent2.getStringExtra(EXTRA_TGLKON)
            val nik = intent2.getStringExtra(EXTRA_NIK)
            val nama = intent2.getStringExtra(EXTRA_NAMA)
            val tgl = intent2.getStringExtra(EXTRA_TGL)
            val jk = intent2.getStringExtra(EXTRA_KELAMIN)
            val hub = intent2.getStringExtra(EXTRA_HUBUNGAN)

            edtNik.setText(nik)
            edtNama.setText(nama)
            date!!.setText(tglkon)
            date2!!.setText(tgl)


            if (tes === "Rapid Tes") {
                radioTes.check(R.id.rapid)
            } else if (tes === "PCR") {
                radioTes.check(R.id.pcr)
            }

            if (jk === "Perempuan") {
                radioSexGroup.check(R.id.jk_p)
            } else if (jk === "Laki - laki") {
                radioSexGroup.check(R.id.jk_l)
            }

            if (hub === "Orang Tua") {
                radioHub.check(R.id.hub_ortu)
            } else if (hub === "Suami / Istri") {
                radioHub.check(R.id.hub_suis)
            } else if (hub === "Anak") {
                radioHub.check(R.id.hub_anak)
            } else if (hub === "Kerabat Lainnya") {
                radioHub.check(R.id.hub_lainnya)
            }
        }


        // perform click event on edit text
        date!!.setOnClickListener { // calender class's instance and get current date , month and year from calender
            val c = Calendar.getInstance()
            val mYear = c[Calendar.YEAR] // current year
            val mMonth = c[Calendar.MONTH] // current month
            val mDay = c[Calendar.DAY_OF_MONTH] // current day
            // date picker dialog
            datePickerDialog = DatePickerDialog(
                this@MainActivity,
                { view, year, monthOfYear, dayOfMonth -> // set day of month , month and year value in the edit text
                    var bulan = ""
                    if ((monthOfYear + 1) == 1) {
                        bulan = "Januari"
                    }
                    if ((monthOfYear + 1) == 2) {
                        bulan = "Februari"
                    }
                    if ((monthOfYear + 1) == 3) {
                        bulan = "Maret"
                    }
                    if ((monthOfYear + 1) == 4) {
                        bulan = "April"
                    }
                    if ((monthOfYear + 1) == 5) {
                        bulan = "Mei"
                    }
                    if ((monthOfYear + 1) == 6) {
                        bulan = "Juni"
                    }
                    if ((monthOfYear + 1) == 7) {
                        bulan = "Juli"
                    }
                    if ((monthOfYear + 1) == 8) {
                        bulan = "Agustus"
                    }
                    if ((monthOfYear + 1) == 9) {
                        bulan = "September"
                    }
                    if ((monthOfYear + 1) == 10) {
                        bulan = "Oktober"
                    }
                    if ((monthOfYear + 1) == 11) {
                        bulan = "November"
                    }
                    if ((monthOfYear + 1) == 12) {
                        bulan = "Desember"
                    }
                    date!!.setText(
                        dayOfMonth.toString() + "  "
                                + bulan + "  " + year
                    )
                }, mYear, mMonth, mDay
            )
            datePickerDialog!!.show()
        }

        // perform click event on edit text
        date2!!.setOnClickListener { // calender class's instance and get current date , month and year from calender
            val c = Calendar.getInstance()
            val mYear = c[Calendar.YEAR] // current year
            val mMonth = c[Calendar.MONTH] // current month
            val mDay = c[Calendar.DAY_OF_MONTH] // current day
            // date picker dialog
            datePickerDialog = DatePickerDialog(
                this@MainActivity,
                { view, year, monthOfYear, dayOfMonth -> // set day of month , month and year value in the edit text
                    var bulan = ""
                    if ((monthOfYear + 1) == 1) {
                        bulan = "Januari"
                    }
                    if ((monthOfYear + 1) == 2) {
                        bulan = "Februari"
                    }
                    if ((monthOfYear + 1) == 3) {
                        bulan = "Maret"
                    }
                    if ((monthOfYear + 1) == 4) {
                        bulan = "April"
                    }
                    if ((monthOfYear + 1) == 5) {
                        bulan = "Mei"
                    }
                    if ((monthOfYear + 1) == 6) {
                        bulan = "Juni"
                    }
                    if ((monthOfYear + 1) == 7) {
                        bulan = "Juli"
                    }
                    if ((monthOfYear + 1) == 8) {
                        bulan = "Agustus"
                    }
                    if ((monthOfYear + 1) == 9) {
                        bulan = "September"
                    }
                    if ((monthOfYear + 1) == 10) {
                        bulan = "Oktober"
                    }
                    if ((monthOfYear + 1) == 11) {
                        bulan = "November"
                    }
                    if ((monthOfYear + 1) == 12) {
                        bulan = "Desember"
                    }
                    date2!!.setText(
                        dayOfMonth.toString() + "  "
                                + bulan + "  " + year
                    )
                }, mYear, mMonth, mDay
            )
            datePickerDialog!!.show()
        }

        val intent = Intent(
            this,
            SubActivity::class.java
        )
        btn_lanjut.setOnClickListener {
            val nik = edtNik.text.toString()
            val nama = edtNama.text.toString()
            val tglkon = date!!.text.toString()
            val tgl = date2!!.text.toString()
            val selectedId = radioSexGroup.checkedRadioButtonId
            val radioSexButton = findViewById<View>(selectedId) as RadioButton

            val selectedId2 = radioHub.checkedRadioButtonId
            val radiohubButton = findViewById<View>(selectedId2) as RadioButton

            val selectedId3 = radioTes.checkedRadioButtonId
            val radioTesButton = findViewById<View>(selectedId3) as RadioButton
            intent.putExtra(EXTRA_TES, radioTesButton.text)
            intent.putExtra(EXTRA_NIK, nik)
            intent.putExtra(EXTRA_NAMA, nama)
            intent.putExtra(EXTRA_TGL, tgl)
            intent.putExtra(EXTRA_TGLKON, tglkon)
            intent.putExtra(EXTRA_KELAMIN, radioSexButton.text)
            intent.putExtra(EXTRA_HUBUNGAN, radiohubButton.text)
            startActivity(intent)
        }
    }

    companion object {
        const val EXTRA_TES: String = "tes"
        const val EXTRA_TGLKON: String = "tglkon"
        const val EXTRA_NAMA: String = "nama"
        const val EXTRA_NIK: String = "nik"
        const val EXTRA_TGL: String = "tgl"
        const val EXTRA_KELAMIN: String = "kelamin"
        const val EXTRA_HUBUNGAN: String = "hubungan"
        const val EXTRA_STATUS: String = "status"
    }
}