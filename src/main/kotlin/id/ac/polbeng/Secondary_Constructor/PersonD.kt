package id.ac.polbeng.Secondary_Constructor

class PersonD {
    var namaDepan: String
    var namaBelakang: String
    var umur: Int
    constructor(_namaDepan: String, _namaBelakang: String, _umur: Int) {
        namaDepan = _namaDepan
        namaBelakang = _namaBelakang
        umur = _umur
    }
}

fun main(){
    val agung = PersonD("Agung", "Tasman", 21)
    println("Nama : ${agung.namaDepan} ${agung.namaBelakang}")
    println("Umur : ${agung.umur}")
}