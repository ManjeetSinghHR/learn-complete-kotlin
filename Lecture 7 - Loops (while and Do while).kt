fun main(){
    // Let's create a table of 2, with "while" loop -
    val num = 2
    var index = 1
    while (index <= 10) // until this condition is true, the loop continuous
    {
            println(num * index)
            index++
    }
    println("Outside loop - " + index)
    // In "while" loop, it checks the condition first before executing the code.

    // Do While loop - Its execute the code first and then check the condition. If the condition is true then its continuous and execute further.

    // Simple E.g. -
    var num1 = 5
    do {
        println("Hello")
        num1--
    }while (num1 <= 1) // This condition is false. But the code executes 1 time.

    // Let's create a table of 5 with "do while loop"
    val num3 = 5
    var index1 = 1
    do {
        println(num3 * index1)
        index1++
    }while (index1 <= 10)
    println("Outside loop - " + index1)
}