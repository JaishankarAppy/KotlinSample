package samplePro

fun main(arg:Array<String>){

println(MyUser.name)

    println(MyUser.user())

    println(MyUser.sample())
}

open  class MySuper{

 open   fun sample(){
        println("Welcome to the party")
    }
}


// Object class also inherits the class of parent class
object MyUser : MySuper(){

    var name : String ="abd"

    fun user()
    {
        println(" Welcome to kotlin")
    }

    override fun sample() {
        super.sample()
    }
}