fun main() {
    val a: String? = null
    println(a)
    if (a != null) {
        a.uppercase()
    }
    a?.uppercase()
    a?.let {
        println("Line 1")
        println("line 2 $a")
        println("Line 3 $it")
    }
    var b = a?:"Hello"
    println(b)
    val c: String? = null
    // println(c!!.uppercase())
}