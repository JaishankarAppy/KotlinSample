package samplePro

fun main(args: Array<String>) {
    var user = User(pay=18, car="jeep")

    empDetail(user)
    // return type example
    println(addProduct(10,20))


}

fun empDetail(user: User){
    println(user)

}

fun addProduct(k:Int,l:Int):Int{
    return k+l

}

data class User(val pay:Int,val car:String)