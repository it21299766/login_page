package com.example.registerstudent.models

import javax.crypto.KeyAgreement

data class FormData(
    val studentID : String,
    val year:Int,
    val semester:String,
    val agreement: Boolean,
)