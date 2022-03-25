package id.ac.polbeng.Inheritance

open class Computer(val name: String, val brand: String) {
}

class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name          : $name")
        println("Brand         : $brand")
        println("Battery Life  : $batteryLife")
    }
}

fun main(){
    val myLaptop = Laptop("Asus TUF FX506LH", "Asus", 9.5)
    println(myLaptop.info())
}