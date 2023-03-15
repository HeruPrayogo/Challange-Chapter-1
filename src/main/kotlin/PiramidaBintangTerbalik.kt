abstract class BentukPiramidaTerbalik{
    abstract fun hasil()

}

class PiramidaBintangTerbalik(private val tinggi:Int):BentukPiramidaTerbalik() {
    override fun hasil() {
        for(i in tinggi downTo 1){
            for(j in 1..tinggi - i){
                print(" ")
            }
            for(k in i..2 * i - 1){
                print("*")
            }
            for(k in 0..i - 1 - 1){
                print("*")
            }
            println()
        }
    }
}