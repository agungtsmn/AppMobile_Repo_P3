package id.ac.polbeng.Polymorphism

open class MyBase {
    open fun think () {

        println("Hey!! i am thinking ")
    }
}

class MyDerived: MyBase() {
    override fun think() {
        println("I Am from Child")
    }
}

fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}