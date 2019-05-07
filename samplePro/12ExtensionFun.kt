package samplePro

fun main(arg:Array<String>){

    var p = Student()

    println("student marks "+p.mark(29))

    println("student marks "+p.check(80))


    var s1 = " Hello "

    var s2 = " world "

    var s3 = " welcome "

    println (s3.add(s1,s2))

}

fun String.add(s1:String,s2:String):String{
    return this+s1+s2
}


// function is oustside from the class

fun Student.check(number:Int):Boolean{

    return number>50
}

class Student {

    fun mark(marks:Int):Boolean{

        return marks>50

    }
}