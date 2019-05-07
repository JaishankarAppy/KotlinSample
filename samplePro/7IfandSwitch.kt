package samplePro

fun main(arg:Array<String>){

    val i = 2
    val j = 5

    var x = 1

    var check = if(i>j) {
        i
    }
            else {
        j
    }
    println(check)

    // Switch statement
    when (x){

        // multiple statement combine together
        0,1,4,6->println("x is 1")
        2->println("x is 2")
        3->println("x is 3")

        // default statement
        else -> println(" unknown x value")
    }



}