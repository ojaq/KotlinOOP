package collection

fun main (){
    //todo pair data class
    //class pair is used to bind data to store in map collection
    //class pair is the same as map, it contains key and value / out A and out B
    //class pair can only store 1 couple of data key and value
    val pair: Pair<Int, String> = Pair(1, "ojaq")
    //use first to get data of  first element or key
    println(pair.first)
    //use second to get data of second element or value
    println(pair.second)

    //we can use keyword 'to' to represent data key & value of pair
    val pair2: Pair<String, String> = "jaq" to "abdurrazaq"
    println(pair2.first)
    println(pair2.second)
}