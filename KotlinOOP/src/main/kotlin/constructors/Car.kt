package constructors

//TODO Constructor
//constructor is a parameter in class
//sometimes properties can be a constructor

//TODO Properties Constructor
//properties constructor let you access class's constructor
//to declare properties constructor we have to add var to constructor
class Car(var color: String, brand: String, modify: Boolean? = false) {

    //TODO Secondary Constructor
    //kotlin supports class to have more than 1 constructor
    constructor(color: String, brand: String) : this(color, brand, null)

    //TODO Initializer Block
    //block will execute after calling constructor
    init {
        if (modify == true) {
            println("me car's $brand is, $color and i've modified it")
        } else if (modify == false) {
            println("me car's $brand is, $color and it's still ori")
        } else {
            println("me car's $brand is, $color and i got it secondhand")
        }
    }
}

fun main(){
    val mercedes = Car("black", "benz", true)
    Car("negro","n1994")
    mercedes.color = "white"
//    mercedes.brand
}