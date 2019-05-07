package samplePro

/*
*   1. Companion Object
* */
fun main(args: Array<String>) {

  println(  MyClass.count)           // You can print it and check result

 println(   MyClass.typeOfCustomers())
}

class MyClass {

    companion object {

        var count: Int = -1             // Behaves like STATIC variable

        @JvmStatic
        fun typeOfCustomers(): String { // Behaves like STATIC method
            return "Indian"
        }
    }
}