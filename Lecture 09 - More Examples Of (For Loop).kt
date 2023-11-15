fun main() {
    // Here we explore more about "for loop"
    // 1. Let's print some numbers like, from 1 to 10.
    for (i in 1..10){
        println(i) // It's a common example of "for loop"
    }
    // 2. Let's calculate "factorial" from "1-10 numbers"
    var factorial = 1
    for (i in 1..10){
        factorial *= i
        println("Factorial Of $i = $factorial")
    }
    // 3. Let's find even or odd numbers, From a list of 1-10
    for (i in 1..10){
        if (i % 2 == 0) print("$i,") // This will print even numbers
    }
    print("\n") // This will add a space in a line
    for (i in 1..10) {
        if (i % 2 != 0) print("$i,") // This will print odd numbers
    }
    // 4. Let's reverse a Given Text "Characters" with "for loop"
    val givenText = "Manjeet Singh" // Text which you want to reverse
    var reversedText = "" // Here we store the reverse text
    for (i in givenText.length - 1 downTo 0){ // Its loop the given text from last character to 1st character 1 by one
        reversedText += givenText[i] // Here it stored the character from last to first one by one
    }
    println("\nThis is the result - $reversedText") // Print the result here
}
