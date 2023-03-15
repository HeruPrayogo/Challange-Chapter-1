abstract class BentukPlusBintang{
    abstract fun printBentukPlusBintang()

}

class PlusBintang(private val height:Int) : BentukPlusBintang() {
    override fun printBentukPlusBintang() {
        for(i in 0 ..height){
            for(j in 0..height){
                if(i == height/2 || j == height/2){
                    print("*")
                }else{
                    print(" ")
                }
            }
            println()
        }

    }
}