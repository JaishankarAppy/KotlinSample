package samplePro

fun main(arg:Array<String>){

    val x = 10
    val y = 30

 //   val greater = x.greaterThan(y)

    val greater = x greaterThan y


    print(greater)
}

infix fun Int.greaterThan(other:Int):Int{

    if (this > other)
        return  this
    else
        return  other
}