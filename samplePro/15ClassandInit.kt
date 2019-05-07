package samplePro

fun main(arg:Array<String>){


    var s = Emp("Jai",10)

    print(s.id)

}

class Emp(name:String){

    var id:Int = -1

    init {
        println("Student name is $name")
    }

    constructor(name:String,id:Int):this(name){

        this.id = id

    }
}