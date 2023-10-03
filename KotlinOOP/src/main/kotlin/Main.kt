//TODO Class
//class ClassName {body class}

//class is a keyword to declare a class in kotlin
//classname must be typed with CamelCase
//class can contain properties and function
//class is a blueprint for creating an object

class Person{
    //TODO Properties
    //properties is a global variable declared in class out of function
    //properties is declared to complete object's needs will create
    var name: String? = null
    var age: Int = 0

}

fun main(){
    //TODO Object
    //object is a realization from class

    //ojaq here is an object
    //because ojaq assigned a class as its value
    //if you call a class you must input a constructor represented as bracket()
    val ojaq = Person()
    //access age from Person's properties by object
    println(ojaq.age)

    //manipulative properties
    ojaq.name = "ojaq"
    ojaq.age = 16
    println(ojaq.name)

}