package com.example.quizapp

//The data class structure is the structure used to hold data in the Kotlin language.
//Parameters must be defined as val or var.
//In order to create a data class, the data keyword is used before the class word.
//When you want to create a simple POJO(Plain Old Java Object) class while writing Java,
// you need to write methods such as getter, setter, equals, toString, hashCode.
//When we write Kotlin, when we use the data keyword in our Class definition,
// Kotlin automatically creates getter setters, hashCode(), equals(), toString(), copy() and componentN() functions that can access fields.


data class QuestionData (
    var id:Int,
    var question:String,
    var option_one:String,
    var option_two:String,
    var option_three:String,
    var option_four:String,
    var correct_ans:Int
        )