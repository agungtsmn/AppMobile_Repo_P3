package id.ac.polbeng.Secondary_Constructor

class PersonF (val namaDepan: String, val namaBelakang: String) {
    init {
        println("Sedang inisialisasi!")
    }
    constructor(_namaDepan: String, _namaBelakang: String, _umur:Int): this(_namaDepan, _namaBelakang){
        println("Nama : $_namaDepan $_namaBelakang")
        println("Umur : $_umur")
        println()
    }
    constructor(_namaDepan: String, _namaBelakang:String, _kota:String): this(_namaDepan, _namaBelakang){
        println("Nama : $_namaDepan $_namaBelakang")
        println("Kota : $_kota")
        println()
    }
    constructor(_namaDepan: String, _namaBelakang:String, _umur:Int, _kota:String): this(_namaDepan,
        _namaBelakang, _umur){
        println("Nama : $_namaDepan $_namaBelakang")
        println("Umur : $_umur")
        println("Kota : $_kota")
    }
}
fun main(){
    val agung = PersonF("Agung", "Tasman")
    val putri = PersonF("Putri", "Nuraniza", 21)
    val faisal = PersonF("Faisal", "Yanto", "Kelapapati Tengah")
    val tito = PersonF("Emil", "Tito", 25, "Pangkalan Batang")
}