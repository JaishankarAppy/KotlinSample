package samplePro

fun main(arg:Array<String>){

    var user1 = Users("abc",10)
    var user2 = Users("abc",10)

    println(user1.toString())

    var user3 = user1.copy()

    println(user3)
   // change the objcet data
   var user4 = user3.copy("hello")

    println(user4)

    if(user1 == user2){
        print("equal")
    }else{
        print("Not Equal")
    }


}

// without data keyword it will consider only object location
// primary constructor must contain val or var ,if it is data class
data class Users (var name:String,var id:Int){



}