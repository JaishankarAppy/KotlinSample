package samplePro

fun main(arg : Array<String>){

    // Ranges help in loops in kotlin

    val a = 1..5
    // this range contains the 1,2,3,4,5


    val b = 5 downTo 1
   // range 5,4,3,2,1

    val c = 5 downTo 1 step 2
    // range 5,3,1

    var d = "a".."z"
    // range "a","b"....."z"

    var e = "i" in d
    // return boolean value true ('in' keyword check the data present or not

    var f = 5.downTo(1)
    // 5,4,3,2,1

    var g = 1.rangeTo(5)
    //1,2,3,4,5


}