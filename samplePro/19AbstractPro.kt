package samplePro

fun main(arg:Array<String>){

    var id = India()

    id.add()
    id.eat()

}

abstract  class  Human{

    abstract var name : String

  abstract  fun eat()

  open  fun add(){}

}

class  India : Human(){

    override var name :String = "hello "  // override abstract properties

    override fun eat(){         // override abstract method

        println("Hello")

    }

    override  fun  add(){
        print ("Hello kotlin")
    }
}