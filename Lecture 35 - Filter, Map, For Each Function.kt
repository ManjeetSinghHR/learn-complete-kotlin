fun main() {
    val a = listOf(1,2,3,4,5)
    val b = a.filter (::isOdd)
    println(b)
    val c = a.filter (fun(a: Int):Boolean {return a % 2 == 0})
    println(c)
    a.filter ({a: Int -> a % 2 != 0})
    a.filter {a:Int -> a % 2 != 0}
    println(a.filter {it % 2 != 0})
    callDataClass()
    anotherExample()
}
fun callDataClass() {
    val a = listOf(PersonClass(1,"MS"), PersonClass(2,"John"), PersonClass(3,"Rock"))
    println(a.filter { it.id == 2 })
    println(a.filter { it.name == "MS" })
    val b = listOf(1,2,3,4,5,6,7,8,9,10)
    println(b.map { it * it })
    println(b.map { it * 5 })
}
fun anotherExample() {
    val a = listOf(PersonClass(1,"MS"), PersonClass(2,"John"), PersonClass(3,"Rock"))
    println(a.map{
        PaidUser(it.id, it.name, "Paid")
    })
    for (i in a) println(i)
    a.forEach{println(it)}
}
data class PaidUser(val id: Int, val name: String, val type: String)
data class PersonClass(val id: Int, val name: String)
fun isOdd(a: Int):Boolean {
    return a % 2 != 0
}