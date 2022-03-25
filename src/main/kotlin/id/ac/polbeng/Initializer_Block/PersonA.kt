package id.ac.polbeng.Initializer_Block

class PersonA(_namaDepan: String, _namaBekalang: String, _umur: Int) {
    var namaDepan : String
    var namaBelakang : String
    var umur: Int
    init {
        namaDepan = _namaDepan
        namaBelakang = _namaBekalang
        umur = _umur
    }
}

fun main(){
    val agung = PersonA("Agung", "Tasman", 20)
    println("Nama : ${agung.namaDepan} ${agung.namaBelakang}")
    println("Umur : ${agung.umur}")
}