fun main() {
    println(DayName.Saturday)
    for (i in DayName.entries) println(i)
    DayName.Sunday.printFormattedDay()
    println(DayName.Saturday.dayNUM)
    callSealedClass()
}
enum class DayName(val dayNUM: Int)
{
    Sunday(1), Monday(2), Tuesday(3), Wednesday(4),
    Thursday(5), Friday(6), Saturday(7);
    fun printFormattedDay() { println("Day is $this") }
}
fun callSealedClass() {
    val tile = Tile.Red("BB",5)
    val tile1 = Tile.Blue("GG",8)
    println(tile.points * 5)
}
sealed class Tile
{
    class Red(val type: String, val points:Int):Tile()
    class Blue(val type: String, val points: Int):Tile()
}