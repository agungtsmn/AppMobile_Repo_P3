package id.ac.polbeng.Initializer_Block

class PersonC(var namaDepan: String, var namaBekalang: String, var umur: Int) {}

fun main(){
    val agung = PersonC("Agung", "Tasman", 20)
    println("Nama : ${agung.namaDepan} ${agung.namaBekalang}")
    println("Umur : ${agung.umur}")
}