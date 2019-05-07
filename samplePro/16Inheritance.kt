package samplePro

fun main(arg:Array<String>){

    var ti = Tiger()

    ti.age =70
    ti.weight =30

    println ("Tiger Weight "+ti.weight)
    println ("Tiger age "+ti.age)

    ti.eat()

}


 open  class Anim() {

    var age:Int =20

    fun eat(){
        println(" non-veg only ")
    }
}

class Tiger : Anim() {

 var weight : Int = -1


}