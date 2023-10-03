package collection

fun main () {
    //TODO set
    //set collection is a datasets that contains only unique data
    //if there's a duplicate data in set i'll automatically be merged
    //set collection is the best way to store unique data's, like username or id
    //we don't have a way to get value from set except checking the value
    val setUsername : Set<String> = setOf("ojaq", "jaq", "jaq", "ojeg", "tak")
    //checks value is it contained in set or not
    println(setUsername.contains("jaq"))
    println(setUsername.size)
    //use elementAt to get element by index
    setUsername.elementAt(0)
    setUsername.forEach{ println(it) }

    //TODO mutable set
    val mutableSet = mutableSetOf(101, 102, 103, 104)
    mutableSet.add(105)
    mutableSet.add(103)
    mutableSet.forEach { println(it) }
}