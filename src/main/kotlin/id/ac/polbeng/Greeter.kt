package id.ac.polbeng

class Greeter {
    var text : String = ""
    fun greet() {
        println("Hello Object World")
    }
    fun greet(nama : String){
        println("$text $nama")
    }
    fun withret(nama : String) : String {
        return  "$text $nama"
    }
}