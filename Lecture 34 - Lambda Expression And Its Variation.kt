fun main() {
    // Lambdas are anonymous functions, and they don't have any names.
    val lambda = {a: Double, b: Double -> a + b} // It's a lambda expression.
    val multiLineLambda = { // It's a multiline lambda, last line will be the return type.
        val a = 2 + 5
        println("Hello World")
        "MS"
        2 // Return type "Int"
    }
    multiLineLambda()
    println(multiLineLambda) // To print its return type
    differentTypeLambda()
}
fun add(a: Double, b: Double):Double { // It's a normal function, we can also convert this in lambda.
    return a + b
}
fun differentTypeLambda() {
    val convertAddAsLambda = {a: Double, b: Double -> a + b} // Lambda expression
    val singleParamLambda = {a: Int -> a * a} // It's a single parameter lambda
    val simplifySingleParam:(Int) -> Int = {it + it} // We can more simplify these single parameter lambdas
    val a:(Int) -> Int = {x -> x + x} // If we declare data type, then we don't need to declare data type in body of the lambda.
    val b:(String) -> Unit = {msg -> println("MS $msg")} // "println" doesn't return anything, so it's return type is "Unit"
    println(calculator(5.0,5.0, {a, b -> a + b})) // We can also write lambda instead of a function.
    println(calculator(5.0,9.0) {a, b -> a + b}) // More correctly we can write like this.
    // If our lambda is last parameter, then we can write it outside the (5.0, 9.0) "{}" like this.
    // It improves our code readability.
}
fun calculator(a: Double, b: Double, ab:(Double, Double) -> Double):Double // Higher order function
{
    return ab(a,b)
}