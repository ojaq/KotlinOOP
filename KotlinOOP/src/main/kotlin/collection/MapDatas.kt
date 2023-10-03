package collection

fun main (){
    //todo map collection
    //a collection with data contains key & value
    //in map collection we can store as many of couple data keys & values
    //key in map represents index
    //key has to be unique data
    //if there's another same key it'll replace the previous data
    val map = mapOf(
        1 to "ojyaaaaaq",
        2 to "muuuuussss",
        3 to "muuuuuul",
        1 to "tot",
        Pair(4, "wleoelwol"),
        5 to "lolwol"
    )

    //get a value by its key
    println(map[1])
    map.forEach{ (key, value) -> println("Key $key = $value") }
}