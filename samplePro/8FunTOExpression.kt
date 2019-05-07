package samplePro

fun main(arg:Array<String>){

    var c  = add(4,5)
    print(c)

}

fun add(a:Int,b:Int):Int = if(a>b){ a} else{ b}