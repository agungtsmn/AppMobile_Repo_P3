package id.ac.polbeng.Nested_dan_Inner_Class

class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}
fun main(args: Array<String>) {
    println(Outer.Nested().b)
    val nested = Outer.Nested()
    println(nested.callMe())
}