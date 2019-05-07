
@file:JvmName("Test")
package samplePro.JavatoKotlin9



fun main(arg:Array<String>){

    var sub = Demo.sub(10,5)

    print(" subtract number is $sub")

}

fun add (a:Int,b:Int):Int{
    return  a+b
}

// calling default function
@JvmOverloads
fun distance(a: Int,b: Int, c:Int = 10 ):Int{

    return a*b*c
}