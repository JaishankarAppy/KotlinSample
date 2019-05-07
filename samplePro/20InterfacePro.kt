package samplePro

fun main(arg:Array<String>){

val btn = MyBtn()

    btn.onClick()
    btn.onTouch()
}

interface  MyListener {

    var name : String

    fun onTouch(){
        println("Listener Interface")
    }

    fun onClick()
}

interface  MyReciver {

    var name : String

    fun onTouch(){
        println("Reciver Interface")
    }


}

class MyBtn : MyListener ,MyReciver{
    override var name: String ="click"

    override fun onClick() {

        println("Onclick is done ")
    }

    override fun onTouch() {
       // super<MyReciver>.onTouch()
        super<MyListener>.onTouch( )
    }


}