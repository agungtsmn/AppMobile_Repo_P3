package id.ac.polbeng.Nested_dan_Inner_Class

fun main() {
    var programmer: Human = object : Human {
        override fun think() {
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}
interface Human {
    fun think()
}