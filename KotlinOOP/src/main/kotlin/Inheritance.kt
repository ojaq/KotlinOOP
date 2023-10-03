//fun main() {
//    val kucing = Kucing("kucing")
//    kucing.suara()
//}

//open class Hewan(val nama: String) {
//    open fun suara() {
//        println("Bunyi hewan")
//    }
//}
//
//class Kucing(nama: String) : Hewan(nama) {
//    override fun suara() {
//        println("$nama: Meow!")
//    }
//}

//open class Mobil(val merek: String){
//    open fun suara(){
//        println("bunyi")
//    }
//}
//
//class F1(merek: String) : Mobil(merek){
//    override fun suara() {
//        println("$merek: ngoeng")
//    }
//}
//
//fun main(){
//    val mobil = F1("redbull")
//    mobil.suara()
//}

open class Animal(val name: String) {
    open fun sound() {
        println("animal sound")
    }
}

class Cat(name: String) : Animal(name) {
    override fun sound() {
        println("meow")
    }
}

fun main() {
    val cat = Cat("memeng")
    println("${cat.name} says:")
    cat.sound()
}

