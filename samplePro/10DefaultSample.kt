package samplePro

fun main(arg:Array<String>){

    var d = test(10)

    print(d)

}

fun test(a:Int,b:Int =10):Int{

    return a+b
}

