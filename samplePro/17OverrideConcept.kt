package samplePro

fun main(arg:Array<String>){
    var an = Lion()

    an.eat()

}

open class Animal {

  open  fun eat(){

        println("Animal eating")
    }
}

class Lion : Animal(){

    override fun  eat(){

        // call the super class method
        super<Animal>.eat()
        print("Lion is eating")
    }

}