import kotlin.math.pow

fun main() {
    // we can use both "Int" & "Double" values with same named functions.
    val result1 = addition(5,5) // "Int" value
    val result2 = addition(5.0,5.0) // "Double" value
    println(result1)
    println(result2)
    println(addition(6,6)) // We can also call function like this
    println(addition(value2 = 9, value1 = 11)) // We can also define values on different places, this is known as "Named Argument"
    // We can also store function in variables
    val result3 = ::power // Power function stored in "result3"
    println(result3(2.0,3.0)) // This is how we call
}
// We can create function with same names and different parameters
// There must be different parameters types, or numbers of parameters are different if we want to create function with same name
fun addition (value1:Int, value2:Int):Int
{
    return value1+value2
}
// This is new function with same name and different parameters
fun addition (value1:Double, value2:Double):Double
{
    return value1+value2
}
fun power (a:Double, b:Double):Double
{
    return a.pow(b)
}