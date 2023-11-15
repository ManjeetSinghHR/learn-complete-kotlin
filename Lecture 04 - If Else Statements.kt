fun main() {

    // Ques 1. Find, Is 10 (Greater, Less Or Equal) To 5.
    
        val NUM = 10
    
        if (NUM > 5) {
            println("10 Is Greater Than 5")
        } else if (NUM < 5) {
            println("10 Is Less Than 5")
        } else {
            println("10 Is Equal To 5")
        }
    
    // We can also write if-else statements as an expression, Here is an example -
    
        val result = if (NUM > 5) {
            ("10 Is Greater Than 5")
        } else if (NUM < 5) {
            ("10 Is Less Than 5")
        } else {
            ("10 Is Equal To 5")
        }
    
        println("Result Is - $result")
    
    // We can also write this code in a single line -
    
        val result1 = if (NUM > 5)  "10 Is Greater Than 5" else if (NUM < 5) "10 Is Less Than 5" else "10 Is Equal To 5"
    
        println("Result Is - $result1")

        
// Ques 2. Let, Suppose we have 5 users in our app, we have to check how many users have our Premium Subscriptions.
// Solution - 1. We have to create 5 users in DB With Unique ID -

    val user1 = "Normal User"
    val user2 = "Premium"
    val user3 = "Normal User"
    val user4 = "Premium"
    val user5 = "Premium"

    var totalSub = 0
    // 2. Here we store total Premium Subscriptions

    if (user1 == "Premium") totalSub = totalSub + 1
    if (user2 == "Premium") totalSub = totalSub + 1
    if (user3 == "Premium") totalSub = totalSub + 1
    if (user4 == "Premium") totalSub = totalSub + 1
    if (user5 == "Premium") totalSub = totalSub + 1

    println("Total Premium Subscriptions Are - $totalSub")

}
