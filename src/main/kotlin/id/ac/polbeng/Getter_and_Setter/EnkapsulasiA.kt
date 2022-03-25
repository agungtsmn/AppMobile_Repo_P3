package id.ac.polbeng.Getter_and_Setter

class EnkapsulasiA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    get() = field
    var name: String = _name
    get() = field
    set(value) {
        field = value
    }
    var age: Int = _age
    get() = field
    set(value) {
        field = value
    }
}
fun main() {
    val emp = EnkapsulasiA(1101, "Agung", 20)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
}