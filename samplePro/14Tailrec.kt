package samplePro

import java.math.BigInteger

fun main(arg:Array<String>){

    println(recurs(100000, BigInteger("1"),BigInteger("0")))
}

// give very big data it will not show stackoverflow error
tailrec fun recurs(n:Int,a:BigInteger,b:BigInteger):BigInteger{

    if (n == 0)
        return b
    else
        return recurs(n-1,a+b,a)
}