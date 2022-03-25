package id.ac.polbeng

fun main(){
    val greeter = Greeter()
    greeter.greet()
    greeter.text = "hi"
    greeter.greet("Agung")
    greeter.greet("Nuraniza")
    greeter.text = "Hello Programmer"
    println(greeter.withret("Viper"))
}