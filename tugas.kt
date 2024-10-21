class Produk(
    var nama: String,
    var harga: Double,
    var stok: Int
) {
    
    fun tampilkanInformasi() {
        println("Nama Produk: $nama")
        println("Harga: Rp.$harga")
        println("Stok: $stok")
    }

    
    fun beliProduk(jumlah: Int) {
        if (jumlah <= stok) {
            stok -= jumlah
            println("$jumlah produk berhasil dibeli.")
        } else {
            println("Stok tidak mencukupi.")
        }
    }
}

fun main() {
    
    val produk1 = Produk("Ipong", 1300000.0, 12)

    
    produk1.tampilkanInformasi()

    produk1.beliProduk(11)

  
    
}
