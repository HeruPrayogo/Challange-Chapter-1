abstract class BentukSegitigaSikuSiku{
    abstract fun printBentukSegitigaSikuSiku()
}

class SegitigaSikuSiku(private val shape: Int): BentukSegitigaSikuSiku() {
    override fun printBentukSegitigaSikuSiku() {
        for(i in 1..shape){
            for(j in 1..i){
                print("* ")
            }
            println()
        }
    }
}