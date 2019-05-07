package samplePro

fun main(arg : Array<String> ){

    // constructor declaration
    var obj = Employee("RCB")
    obj.display()
}

class Employee(var name:String){

    fun display(){

        println(" person name  $name")
    }

}
