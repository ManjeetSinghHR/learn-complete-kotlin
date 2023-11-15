fun main() {
    val number = 5
    val result = number in 1..5 // It includes values 1,2,3,4,5
    println(result)

    val number1 = 5
    val result1 = number1 in 1..4 // It includes values 1,2,3,4
    println(result1)

    val number2 = 5
    val result2 = number2 in 1 until 5 // It includes values 1,2,3,4
    println(result2)

    val number3 = 5
    val result3 = number3 in 1 until 6 // It includes values 1,2,3,4,5
    println(result3)
}
