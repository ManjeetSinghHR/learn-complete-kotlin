fun main() {
    // Overriding - We get features from our parents but if we want to change some features, then it is known as overriding.
    val mobile = Mobile()
    val onePlus = OnePlus()
    mobile.display()
    mobile.makeCall()
    mobile.powerOff()
    onePlus.display()
    onePlus.makeCall()
    onePlus.powerOff()
    val mobile2 = Mobile2("Simple Mobile")
    val onePlus2 = OnePlus2("SmartPhone")
    println(onePlus2.toString())
    println(onePlus2.display())
    println(mobile2.display())
}
open class Mobile // If there is no constructor we can also write without this - ()
{
    open val name: String = "Simple Mobile"
    open val size: Int = 5
    // The above "val" are open, we can override them.
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple mobile display") // We can override this, because it's open
}
class OnePlus:Mobile()
{
    override val name: String = "OnePlus Mobile" // Method of overriding
    override val size: Int = 6
    override fun display() {
        println("OnePlus Display")
    }
}
// if we have a class with constructor and parameters, then how we call that
// here is an example -
open class Mobile1(val type: String) // Here is parameter type constructor
class OnePlus1:Mobile1("Smartphone") // Here is how we call with constructor, But this is hard coded text, we can convert it to Soft code
open class Mobile2(val type: String) // Another example of parameter constructor
{
    open fun display() = println("Mobile2 Display")
}
class OnePlus2(val type1: String):Mobile2(type1) // That is how we convert hard coded to soft code
{
    // if we want to call the parent functionality and as well as want to add own functionality, then there is a method called "super"
    override fun display() {
        super.display() // Call the parent functionality first
        println("OnePlus2 Display") // Add your own functionality
    }
    // In kotlin, there is by default a parent class of every class known as "ANY" class
    // In this class there are many methods and all are open, we can override these methods like - "equals" "hashcode" and "toString"
    override fun toString(): String {
        return "Override String"
    }
}