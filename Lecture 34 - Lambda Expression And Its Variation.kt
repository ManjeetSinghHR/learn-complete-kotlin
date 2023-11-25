fun main() {
    val lambda = {a: Double, b: Double -> a + b}
    val multiLineLambda = {
        val a = 2 + 5
        println("Hello World")
        "MS"
        2
    }
    multiLineLambda()
    println(multiLineLambda)
    differentTypeLambda()
}
fun add(a: Double, b: Double):Double {
    return a + b
}
fun differentTypeLambda() {
    val convertAddAsLambda = {a: Double, b: Double -> a + b}
    val singleParamLambda = {a: Int -> a * a}
    val simplifySingleParam:(Int) -> Int = {it + it}
    val a:(Int) -> Int = {x -> x + x}
    val b:(String) -> Unit = {msg -> println("MS $msg")}
    println(calculator(5.0,5.0, {a, b -> a + b}))
    println(calculator(5.0,9.0) {a, b -> a + b})
}
fun calculator(a: Double, b: Double, ab:(Double, Double) -> Double):Double
{
    return ab(a,b)
}