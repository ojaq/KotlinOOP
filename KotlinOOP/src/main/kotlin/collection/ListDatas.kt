package collection

fun main (){
    //TODO list
    //list is a collection similar to array has index for its data
    //list is an immutable collection
    val list: List<String> = listOf("abdur", "razaq", "ww")
    println(list[0])
    println(list[1])
    println(list[2])
    println("List is empty : ${list.isEmpty()}")
    println("index of ww is ${list.indexOf("ww")}")
    println("is there value razaq in the list? ${list.contains("razaq")}")

    //list has a subclass which can mutable the value called mutable list
    val mutableList = mutableListOf(
        mobil("mbw", "purple", 10000),
        mobil("wowo", "negro", 12000)
    )
    //add data to table list
    mutableList.add(mobil("esf", "whity", 10000))
    mutableList.add(mobil("esf", "whity", 10000))
    //remove at is used to remove data by index from mutable list
    //if we use mutableList.lastIndex it means we remove the last index from the data
    mutableList.removeAt(mutableList.lastIndex)
    //remove used for removing specific
    mutableList.remove(mobil("wowo", "negro", 12000))
    mutableList.add(mobil("wowo", "negro", 15000))
    mutableList.set(1, mobil("wowo", "negro", 20000))
    mutableList.forEach { println(it) }
}

data class mobil(
    var brand : String,
    var color : String,
    var cc : Int
)