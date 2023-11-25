fun main() {
    println("My name is Manjeet Singh")
    println("My name is Manjeet Singh".formatString())
    calculateTime {
        loop(10000000)
    }
}
fun String.formatString(): String
{
    return "------------------------------\n$this\n------------------------------"
}
fun loop(a: Long)
{
    for (i in 1..a) {}
}
inline fun calculateTime(a:() -> Unit)
{
    val start = System.currentTimeMillis()
    a()
    val end = System.currentTimeMillis()
    println("Time taken is ${end - start}ms")
}