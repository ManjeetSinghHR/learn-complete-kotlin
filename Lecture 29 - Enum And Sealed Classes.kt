fun main() {
    println(DayName.Saturday) // to print the value
    for (i in DayName.entries) println(i) // we can also loop
    DayName.Sunday.printFormattedDay() // call the function and "$this" - points to "Sunday"
    println(DayName.Saturday.dayNUM) // to print day number
    callSealedClass()
}
// -----------------------------------> Enum Class -
// If we want to set some values to a variable and the values are fixed,
// other values can't be assigned except the fixed values, then it is known as Enum Class.
// Example - In weekdays, we can have values like Sunday.....Saturday.
// Other values don't make any sense, In such cases we use Enum class to fix the values.
enum class DayName(val dayNUM: Int) // It's an enum class, and we can also define constructor in enum class.
{
    Sunday(1), // These are the values of enum class.
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7); // must add semicolon ";" in last object/value before adding a function.
    fun printFormattedDay() { // We can also define functions in enum class
        println("Day is $this") // "$this" - It points to the current object.
    }
}
// -----------------------------------> Sealed Class -
/*
In Enum class, we cannot change the values. For E.g. - If we have red and blue,
then we cannot change their values, but if we want to change their value then we need sealed class.
--> They help to add different version of red & blue.
--> In simple words, In enum class, we restrict the values but in sealed class, we restrict the type not the value.
--> In Enum, we can create only one object of the value, but in sealed class, we can create multiple objects of their values.
--> We have to define all types of sealed class in the same file because they don't work on other file.
--> Sealed class is an abstract class, we cannot create object of it, but we can create different objects of their types.
 */
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