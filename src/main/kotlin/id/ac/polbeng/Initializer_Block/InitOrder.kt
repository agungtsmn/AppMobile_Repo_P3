package id.ac.polbeng.Initializer_Block

class InitOrder(nama : String) {
    val propertiPertama = "Properti Pertama : $nama".also(::println)
    init {
        println("Penginisialisasi Blok Pertama ${nama}")
    }
    val secondProperty = "Properti Kedua : ${nama.length}".also(::println)
    init {
        println("Penginisialisasi Blok Kedua ${nama.length}")
    }
}

fun main(){
    val initOrder = InitOrder("Amanda Agung Permata")
}