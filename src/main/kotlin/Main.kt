fun main() {
    val segitigaSikuSiku = SegitigaSikuSiku(8)
    val piramidaBintang = PiramidaBintang(8)
    val piramidaBintangTerbalik = PiramidaBintangTerbalik(8)
    val diamond = Diamond(8)
    val xBintang = XBintang(8)
    val plusBintang = PlusBintang(8)
    piramidaBintang.gambar()
    println(" ")
    piramidaBintangTerbalik.hasil()
    println(" ")
    diamond.printDiamond()
    println(" ")
    xBintang.printBentukXBintang()
    println(" ")
    plusBintang.printBentukPlusBintang()
    println(" ")
    segitigaSikuSiku.printBentukSegitigaSikuSiku()

}