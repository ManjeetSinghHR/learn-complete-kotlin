fun main() {
    val a = Employee() // Data class call
    a.name = "MS" // Normal method to set properties
    a.age = 24 // Normal method to set properties
    // <------- Return value of this will be an object, and it's returned to "a" in last. we can also store this to a variable. ------->
    a.apply { // Set properties with "apply" function
        name = "MS" // Saves our time, no need to add "a.name"
        age = 24
    }
    println(a.name) // Normal method to print properties
    println(a.age)
    // <------- We can simplify this with the help of "let". Return value of this will be the return value of its last statement. ------->
    val b = a.let {
        println(it.name) // "it" - points to "a"
        println(it.age)
        2 // Return value "Int"
    }
    println(b)
    // <------- We can also use this in "null safe" ------->
    val c:Employee? = null
    c?.name = "Singh"
    c?.age = 16
    c?.let {
        c.name = "Singh"
        it.age = 20
    }
    val d = Employee()
    // <------- In above code we need to add "it." every time, we can also more simplify this with the use of "with" function ------->
    with(d){ // Return value of this will be the return value of its last statement.
        name = "Singh"
        age = 20
    }
    // <------- In above E.g. we are calling "with" externally, if we want a function which is also similar to "a.let" ------->
    // <------- then, we have another utility function "run" ------->
    d.run { // It's a combination of "with" or "let"
        name = "Singh"
        age = 23
    }
    // <------- "also" function is similar to "let" function ------->
    // <------- But, it returns the original object, rather than the result of the block ------->
    // <------- It's often used for side effects, like - "logging" ------->
    d.also {
        it.name = "Singh"
        it.age = 24
    }
}
data class Employee(var name: String = "", var age: Int = 18) // It's a normal Data Class.