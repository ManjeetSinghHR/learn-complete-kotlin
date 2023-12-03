fun main() {
    val a = listOf(1,2,3,4,5) // This is a list, If we want to print odd values only from this list then we use "filter" function.
    // Now we need a function whose input type is "Int" and return type is "Boolean",
    // So, we have a function "isOdd" with same need. We pass this in filter, and it's filter the odd values
    val b = a.filter (::isOdd) // This filter function loop on the elements by using the "isOdd" function.
    // And checks the condition one by one, when condition is true it adds value to the list otherwise ignore the value.
    println(b)
    val c = a.filter ( // We can also write the function directly in "filter"
        fun(a: Int):Boolean {
            return a % 2 == 0
        })
    println(c)
    a.filter ({a: Int -> a % 2 != 0}) // We can also pass lambdas in it.
    a.filter {a:Int -> a % 2 != 0} // Simplify if lambda is last parameter.
    println(a.filter {it % 2 != 0}) // Here is only single parameter, then we can also write like this.
    callDataClass()
    anotherExample()
}
fun isOdd(a: Int):Boolean { // It's a normal function which checks the value is odd or not.
    return a % 2 != 0
}
fun callDataClass() {
    val a = listOf(PersonClass(1,"MS"), PersonClass(2,"John"), PersonClass(3,"Rock"))
    println(a.filter { it.id == 2 }) // Find out the user with the id
    println(a.filter { it.name == "MS" }) // Find out the user with the name
    val b = listOf(1,2,3,4,5,6,7,8,9,10)
    // --> Map function - It converts data from one form to another.
    println(b.map { it * it }) // It squares the values of the list by multiplying itself
    println(b.map { it * 5 }) // If multiplies the list values with "5"
}
fun anotherExample() {
    val a = listOf(PersonClass(1,"MS"), PersonClass(2,"John"), PersonClass(3,"Rock"))
    // If we want to create "Paid User" object by using the old list "a", then we can do this also by using "map" function.
    println(a.map{
        PaidUser(it.id, it.name, "Paid")
    })
    for (i in a) println(i) // loop the list
    // We can more simplify the loop by using the "forEach" function. We can also use lambda expression in it.
    a.forEach{println(it)} // By using "forEach" function.
    // Lambda makes developer life easy, because we can express more in less words.
    // Always use "it" function in single parameter lambda.
}
data class PaidUser(val id: Int, val name: String, val type: String) // Normal data class
data class PersonClass(val id: Int, val name: String) // Normal data class