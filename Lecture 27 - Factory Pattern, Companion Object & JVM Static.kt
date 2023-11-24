fun main() {
    NewClass.X.display()
    NewClass1.display()
    makePizza()
}
class NewClass {object X {fun display() {println("I am object X")}}}
class NewClass1 {companion object X{fun display() { println("I am Companion Object")}}}
fun makePizza()
{
    val orderPizza = Pizza.createPizza("Tomato")
    println(orderPizza)
    val orderPizza1 = Pizza.createPizza("Capsicum")
    println(orderPizza1)
}
class Pizza private constructor(private val type: String, private val topping: String)
{
    companion object Factory {
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