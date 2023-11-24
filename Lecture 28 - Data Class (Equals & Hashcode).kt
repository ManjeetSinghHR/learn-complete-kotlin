fun main() {
    val p1 = PersonDetails(1, "John")
    val p2 = PersonDetails(2, "Boss")
    println("P1 - $p1\nP2 - $p2")
    val p3 = p1.copy(id = 3, name = "MS")
    println(p3)
    val (id, name) = p2
    println(id)
    println(name)
    println(p1.component1())
    println(p1.component2())
    println(p2.component2())
}
data class PersonDetails(val id: Int, val name: String)