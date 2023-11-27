fun main() {
    // Data Classes are used to store data.
    // You must define at-least one Primary constructor in data class.
    // When we print any object reference, then its calling its "toString()" Method, behind the scenes - "p1.toString()" is calling.
    // "toString()" of every object is different and when we compare two objects then they returns false.
    // But objects of data class don't compare "toString()", they compare the data only, if the data is same then they returns true.
    // These all methods are coming from the super class - "Any" Class.
    // We have 3 methods in the "Any" class -
    // 1. equals(other: Any?): Boolean
    // 2. hashcode(): Int
    // 3. toString(): String
    val p1 = PersonDetails(1, "John")
    val p2 = PersonDetails(2, "Boss")
    println("P1 - $p1\nP2 - $p2")
    val p3 = p1.copy(id = 3, name = "MS") // 'p1.copy' - it creates the copy of the object. It's a utility function.
    // We can also change the values of the copy object - "p1.copy(id = 3, name = "MS")"
    println(p3)
    val (id, name) = p2 // ---> It's known as D - Structuring. It's implement "p2" properties into "id & name"
    println(id) // Simple method to print properties
    println(name)
    println(p1.component1()) // Another method to print properties, "component1()" = id
    println(p1.component2()) // Another method to print properties, "component2()" = name
    println(p2.component2())
}
data class PersonDetails(val id: Int, val name: String) // It's a Data class Syntax
// -------------------------------------------------------------------------------->
// -> In java, we have to define "getter & setter" for each class and then override them to make the data class.
// -> It's create "Boilerplate" coding and the developer have to write long codes to make the data class.
// -> But in kotlin, we have to write only "data" keyword, to make it data class.
// -> Rest all work auto complete in the background in Kotlin.
// -> In data class, constructor can be both "var or val" type.