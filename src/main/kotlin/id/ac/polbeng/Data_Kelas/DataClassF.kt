package id.ac.polbeng.Data_Kelas

fun main() {
    val meri = Student("Meri", 20)
    val name = meri.component1()
    val age = meri.component2()
    println("Name = $name")
    println("Age = $age")
}