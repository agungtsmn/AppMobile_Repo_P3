package id.ac.polbeng.Initializer_Block

class PersonB(_namaDepan: String, _namaBekalang: String, _umur: Int) {
    var namaDepan : String = _namaDepan
    var namaBelakang : String = _namaBekalang
    var umur: Int = _umur
}

fun main(){
    val agung = PersonB("Agung", "Tasman", 20)
    println("Nama : ${agung.namaDepan} ${agung.namaBelakang}")
    println("Umur : ${agung.umur}")
}