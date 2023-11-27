fun main() {
    // We can also create object in classes. All the rules will remain same.
    NewClass.X.display() // Object name "X" is necessary because object is not companion.
    NewClass1.display() // We can call function directly, because object is companion.
    makePizza()
}
// ----------------------------->
class NewClass // Simple class
{
    object X { // object inside the class
        fun display() {
            println("I am object X")
        }
    }
}
// -----------------------------> Companion Object -
// With the help of "companion", we can directly access the object properties and functions, without writing Object name.
// In a class, there may be only one companion object.
class NewClass1 // Simple class
{
    companion object X { // It's a "companion" object
        @JvmStatic // ----> Now we can call this object in Java.
        fun display() {
            println("I am Companion Object")
        }
    }
}
// ----------------------------->
fun makePizza()
{
    val orderPizza = Pizza.createPizza("Tomato")
    println(orderPizza)
    val orderPizza1 = Pizza.createPizza("Capsicum")
    println(orderPizza1)
}
// -----------------------------> Factory Pattern <-----------------------------
// In simple words, factory pattern is a method, we pass parameters, and it returns the object.
// It is also known as factory of objects.
// -----> Example of factory pattern using companion <-----
class Pizza private constructor(private val type: String, private val topping: String)
{
    companion object Factory { // This is our factory object
        fun createPizza(pizzaType: String): Pizza {
            return when (pizzaType) {
                "Tomato" -> Pizza("Tomato", "Tomato, Cheese")
                "Paneer" -> Pizza("Paneer Farm", "Paneer, Tomato, Onion")
                else -> Pizza("Basic", "Onion")
            }
        }
    }
    override fun toString(): String {
        return "Pizza Type - $type, Toppings - $topping"
    }
}
// -------------------------------------------------- JVM Static --------------------------------------------------
// Kotlin & Java both are inter-Operable. It means we can call java code in kotlin and kotlin code in java.
// But, in some cases if the kotlin function is not static, then we cannot call it in java.
// To make the function Static, we use JVM Static. It helps us to access the code in java.
// Syntax --> @JvmStatic