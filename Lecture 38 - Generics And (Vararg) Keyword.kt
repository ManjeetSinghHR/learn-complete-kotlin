fun main() {
    val a = IntClassNormal(5)
    a.getValue()
    val b = StringClassNormal("Singh")
    b.getValue()
    val c = GenericClass(5)
    val d = GenericClass("Singh")
    c.getValue()
    d.getValue()
    add(1,2,3,4,5,6,7,8,9,10)
    add(1,1,1,1,1,1,1,1,1,1)
}
class IntClassNormal(var a: Int) {
    fun getValue() {println(a)}
}
class StringClassNormal(var a: String) {
    fun getValue() {println(a)}
}
class GenericClass<Type>(var a:Type)
{
    fun getValue() {println(a)}
}
fun add(vararg values: Int) {
    var sum = 0
    for (i in values) {
        sum+= i
    }
    println(sum)
}