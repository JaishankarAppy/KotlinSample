package samplePro

fun main(arg:Array<String>){

   val dog = Dog("golden","lab")

}
open  class Pets{

var color :String = ""

    constructor(color: String){
        this.color = color

        println ("From Animal $color ")
    }

}

// passing constructor to super class constructor
class Dog : Pets{


var breed :String =""

    constructor(color: String,breed: String):super(color){

        this.color = color
        this.breed = breed

        println ("From Dog color $color and breed $breed")

    }

}