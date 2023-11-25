fun main() {
    val a = listOf(1,2,3)
    println(a[2])
    println(a.contains(0)) // check values
    // a[1] = 2
    immutable()
    maps()
}
fun immutable() {
    val b = mutableListOf(1,2,3,4,5)
    b[0] = 6
    b.add(6)
    b.remove(4)
    println(b)
    val a = listOf(10,11)
    b.addAll(a)
    println(b)
}
fun maps() {
    val a = mutableMapOf<Int, String>()
    a.put(1, "MS")
    a.put(2, "John")
    println(a.get(1))
    println(a.get(5))
    a[3] = "Rock"
    println(a[3])
    for ((i, j) in a) println("$i - $j")
    val b = mapOf<Int, String>(1 to "Hello", 2 to "World")
    println(b)
    println(b.size)
}