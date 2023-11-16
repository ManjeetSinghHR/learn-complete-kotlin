fun main() {
    // If we want to store 50 students name then making 50 variables are messy and for like that problems we use "Array"
    // These are objects which stores multiple values of same type like - Int, Double Etc.
    // We can explicit define there type also
    // All the arrays are stored in memory with their values and index
    // Their index are started from "[0]"
    val arr1 = arrayOf("One", "Two", "Three") // Index of [One = 0], [Two = 1], [Three = 2]
    // To access particular element of array, we have two methods -
    println(arr1[0]) // Method 1
    println(arr1.get(1)) // Method 2
    val arr2 = arrayOf<Int>(1,2,3) // <Int> is explicit defined type
    for (i in arr1) println(i) // to print all element of array
    for (i in arr2) println(i) // to print all element of array
    // we can also print all elements with their index
    for ((i, e) in arr1.withIndex()){
        println("$i - $e")
    }
    // we can also set another value to a particular element
    arr2.set(0, 67) // Method 1
    println(arr2[0])
    arr2[1] = 89 // Method 2
    println(arr2[1])
    // we can also print the size of array
    println("Size of array is ${arr1.size}")
}