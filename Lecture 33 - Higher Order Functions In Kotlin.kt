fun main() {
    val a = addFN(5.0,6.0)
    println(a)
    val b = ::addFN
    println(b(10.0,5.0))
    val c:(a: Double, b:Double) -> Double = ::addFN
    println(c(5.0,5.0))
    main2()
}
fun addFN(a: Double, b: Double): Double {
    return a + b
}
fun multiplyFN(a: Double, b: Double): Double {
    return a * b
}
fun main2() {
    calculate(50.0,60.0, ::addFN)
    calculate(10.0,66.0, ::multiplyFN)
}
fun calculate(a: Double, b: Double, newFn:(Double, Double) -> Double)
{
    val result =  newFn(a,b)
    println(result)
}