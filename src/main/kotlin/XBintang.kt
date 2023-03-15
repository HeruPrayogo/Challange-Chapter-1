abstract class BentukXBintang{
    abstract fun printBentukXBintang()
}
class XBintang(private val tinggi: Int):BentukXBintang() {
    override fun printBentukXBintang() {
        for (i in 0..tinggi){
            for(j in 0..tinggi){
                if(j == i || i+j == tinggi){
                    print("*")
                }else{
                    print(" ")
                }
            }
            println()
        }
    }
}

