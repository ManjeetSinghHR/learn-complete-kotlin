fun main() {
    // Kotlin is an object-oriented language as well as a functional language also.
    // Functions are known as First class citizens in kotlin.
    // They also treated as an object like - we can pass arguments, put them in variables, return them as well.
    val a = addFN(5.0,6.0)
    println(a)
    // We can also store function in variables with [::] - operator.
    val b = ::addFN // assigned "addFN" function
    println(b(10.0,5.0))
    val c:(a: Double, b:Double) -> Double = ::addFN // We can also specify type explicitly.
    println(c(5.0,5.0))
    main2()
}
fun addFN(a: Double, b: Double): Double { // It's a normal function
    return a + b
}
fun multiplyFN(a: Double, b: Double): Double {
    return a * b
}
fun main2() {
    calculate(50.0,60.0, ::addFN) // This is how we call higher order function.
    // "::addFN" - The declaration of "::addFN" matches to "calculator" That's why we use it in otherwise it produces error.
    // Type must be same before using it.
    calculate(10.0,66.0, ::multiplyFN)
}
// --> Higher order function - Function that accepts function as argument or return function or both.
fun calculate(a: Double, b: Double, newFn:(Double, Double) -> Double) // This is a higher order function
// "newFn" - Name of function, "(Double, Double)" - Function type, "-> Double" - Return type
{
    val result =  newFn(a,b)
    println(result)
}