fun main() {
    // If there is too many conditions, and we want to improve the readability of code, then we use when statement.

    // E.g. without when -
    val animal = "Dog"
    if (animal == "Horse"){
        println("Animal is Horse")
    }
    else if (animal == "Cat"){
        println("Animal is Cat")
    }
    else if (animal == "Dog"){
        println("Animal is Dog")
    }
    else {
        println("Animal not found")
    }
}