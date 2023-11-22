fun main() {
    // If we don't know about body and properties of our class or functions, then we use abstract class.
    // All the abstract functions can only be existed in abstract class.
    // Abstract class is also a parent class, we don't need to define "open", if we are using abstract class.
    // We can't create any instance of the abstract class. E.g. - val result = Shape2()
    // We need to override all the functions which are abstracted.
    // If a class has abstract method or property, then the class must be declared as abstract.
    // Abstract class can have both abstract & non - abstract properties and methods.
    val result = Circle3(5.0)
    println(result.area())
    result.display()
}
abstract class Shape2 // This is an abstract class
{
    var name: String = ""
    abstract fun area(): Double // Need to override this.
    abstract fun display() // There is no "body" of this function.
}
class Circle3(val radius: Double):Shape2()
{
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun display() {
        println("Function is getting displayed")
    }
}