fun main() {
    // Function is a block of code to perform certain functionality. It helps to reduce the code.
    // Syntax - fun methodName (Parameter1, Parameter2...):Return Type{
    //                                       Block of code & Return result
    //                                       }
    val result1 = add(5,5) // This is how we call a function
    println(result1)
    val result2 = evenOrOdd(7)
    println(result2)
    val result3 = add1(3,8)
    println(result3)
    // let's call the function directly
    printMSG(5) // (5) - These are called arguments
    printMSG() // if we didn't mention value here, it takes which we defined below automatically "2"
}
fun add (num1:Int, num2:Int):Int // this is a simple function which adds two given numbers of "Int" type
{
    val sum = num1+num2
    return sum
}
fun evenOrOdd (value1:Int) // Here is no return type, if we didn't mention any return type, then kotlin uses its default return type "Unit"
{
    val result = if (value1 % 2 == 0) "Even" else "Odd"
    println(result)
}
// we can also make function "Inline" if we have only one statement, Let's make 1st "add" function inline
fun add1 (num3: Int, num4:Int):Int = num3 + num4 // this is "inline" or "one linear" function
fun printMSG (count:Int = 2) // (count:Int = 2) - these are called parameters, all the parameters are "val" type by default, we can manually define their types also
{
    for (i in 1..count)
        println("Hello $i")
}
