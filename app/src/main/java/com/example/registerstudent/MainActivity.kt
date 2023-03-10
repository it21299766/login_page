package com.example.registerstudent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import com.example.registerstudent.models.FormData

class MainActivity : AppCompatActivity() {
    lateinit var edtStudentId: EditText
    lateinit var spnYear: Spinner
    lateinit var spnSemester:Spinner
    lateinit var cbAgree: CheckBox
    lateinit var tvYear: TextView
    lateinit var tvSemester:TextView
    lateinit var btnSubmit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtStudentId  = findViewById(R.id.edtStudentId)
        tvYear = findViewById(R.id.tvYear)
        spnYear = findViewById(R.id.spnYear)
        tvSemester = findViewById(R.id.tvSemester)
        spnSemester = findViewById(R.id.spnSemester)
        cbAgree = findViewById(R.id.cbAgree)
        btnSubmit=findViewById(R.id.btnSubmit)

    }
    override fun onResume(){
        super .onResume()
        btnSubmit.setOnClickListener(){
            val myForm =FormData(
                edtStudentId.text.toString(),
                spnYear.selectedItem.toString(),
                spnSemester.selectedItem.toString()

            )
        }
        fun displayAlert(title:String, message:String){
            val AlertDialog
            val builder = AlertDialog.Builder(this)
            builder.setTitle(title)     builder.setMessage(message)
            builder.setPositiveButton("OK")
            }
        val dialog =builder.create()

    }

}