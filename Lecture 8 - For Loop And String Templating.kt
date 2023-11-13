fun main() {
    // We use "for loop" where we know how many times a loop can run.
    // We can use "for loop" with ranges
    // Let's print "Hello" 5 times with "for loop"
    for (i in 1..5)
        println("Hello" + i) // Here the loop is increment by 1 automatically, we can also change the increment with the help of "step"

    for (i in 1..5 step 2) // Here the increment will be from 2
        println("Hello " + i)

    // Let's create a table of 2 with the help of "for loop"
    val num = 2
    for (i in 1..10)
        println(num * i)

    // Let's loop with "until range"
    for (i in 1 until 5)
        println("Hello Until " + i)

    // Here all values are increment to ++ we can also decrement the values to -- with the help of "down to"
    for (i in 5 downTo 1)
        println(i)
    // We can also use "step" with "down to"
    for (i in 5 downTo 1 step 2)
        println("Down To With Step " + i)
    // Let's create a table of 5 with a well formatted design like 5 x 1 = 5
    val num1 = 5
    for (i in 1..10)
        println(num1.toString() + "x" + i + " = " + num1 * i) // we have to convert "num1" to "toString" If we want to use "+" function
    // The above code is hard to read, we can make it easy with the help of "String Templating"
    val num2 = 5
    for (i in 1..10)
        println("$num2 x $i = ${num2 * i}") // This code is easy to read.
    // If we want to refer a variable then we use "$" To refer that and if we want to write an expression then we Use "$" with "{}"
    // for E.g. "${write expression here}"
}