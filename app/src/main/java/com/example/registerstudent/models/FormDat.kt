package com.example.registerstudent.models

 class FormDat(
     private var studentID:String,
     private var year:String,
     private var semester:String,
     private var agree:Boolean,
 ){
     fun validateStudentId(): ValidationResult {
         return if(studentID.isEmpty()){
             ValidationResult.Empty("Student ID is empty")
         }
         else if(!studentID.startsWith("IT")){
             ValidationResult.Invalid(("Should be starting with IT"))

         }else if(studentID.length<10){
             ValidationResult.Invalid("Student ID should have 10 characters")
         }else if(studentID.length>10){
             ValidationResult.Invalid("Stuent ID should have 10 characters")
         }else
             ValidationResult.Valid

         }
     fun Vali(): ValidationResult {
         return if(studentID.isEmpty()){
             ValidationResult.Empty("Student ID is empty")
         }
         else if(!studentID.startsWith("IT")){
             ValidationResult.Invalid(("Should be starting with IT"))

         }else if(studentID.length<10){
             ValidationResult.Invalid("Student ID should have 10 characters")
         }else if(studentID.length>10){
             ValidationResult.Invalid("Stuent ID should have 10 characters")
         }else
             ValidationResult.Valid

     }
 }

