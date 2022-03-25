package id.ac.polbeng.Secondary_Constructor

class PersonE {
    var namaDepan: String
    var namaBelakang: String
    var umur: Int = 20
    constructor(_namaDepan: String, _namaBelakang: String){
        namaDepan = _namaDepan
        namaBelakang = _namaBelakang
    }
    constructor(_namaDepan: String, _namaBelakang: String, _umur: Int): this(_namaDepan, _namaBelakang){
        umur = _umur
    }
    fun cetakInfo(){
        println("Nama : ${namaDepan} ${namaBelakang}")
        println("Umur : ${umur}")
    }
}

fun main(){
    val agung = PersonE("Agung", "Tasman")
    agung.cetakInfo()
    println()
    val putri = PersonE("Putri", "Nuraniza", 21)
    putri.cetakInfo()
}