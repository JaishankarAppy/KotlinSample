package samplePro

fun main(arg : Array<String>){

var obj = Person()
    obj.name = "RCB"
    obj.display(obj.name)

}

class Person{

  //  val keyword cannot be change
 //   val name : String = ""
       var name : String = ""

    fun display(name:String){

        print(name)

    }
}