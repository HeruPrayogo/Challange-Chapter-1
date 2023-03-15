abstract class BentukPiramidaBintang{
    abstract fun gambar()

}
class PiramidaBintang(private val height:Int ): BentukPiramidaBintang() {
    override fun gambar() {
        for(i in 1..height){
            for(j in 1..height - i){
                print(" ")
            }
            for(j in 1..2*i -1){
                print("*")
            }
            println()
        }
    }
}