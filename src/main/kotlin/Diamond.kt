abstract class BentukDiamond{
    abstract fun printDiamond()
}

class Diamond (private val height:Int): BentukDiamond(){
    override fun printDiamond() {
        for(i in 1..height) {
            for(j in i..height - 1){
                print(" ")
            }
            for(k in 1..i * 2 - 1){
                print("*")
            }
            println()
        }
        for(k in height-1 downTo 1){
            for(i in k..height-1){
                print(" ")
            }
            for(j in 1..k*2 - 1){
                print("*")
            }
            println()
        }
    }
}