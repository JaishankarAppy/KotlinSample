package samplePro

fun main(args: Array<String>) {

var name:String ="XXX"

    display(name)

    var a = Login()
    a.name = "Udaya"
    a.detail("jaishankar")

    println("Person name is ${a.name}")

}
// using function call from main method
fun  display(test:String){

    println(test)
}

// create class and call from main method

class Login {

    var name : String = ""

    fun detail(name:String){
        println(name)
    }
}