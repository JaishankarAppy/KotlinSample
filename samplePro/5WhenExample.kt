package samplePro

fun main(args: Array<String>) {

    val x = 1

    val str: String  = when (x) {

        1 -> {
           println( "x is 1")
            "X is 6"
        }

        2 -> "x is 2"
        else -> {
            "x value is unknown"
            "x is an alien"
        }
    }

    println(str)
}