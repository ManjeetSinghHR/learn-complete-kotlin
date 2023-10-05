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
    
    }