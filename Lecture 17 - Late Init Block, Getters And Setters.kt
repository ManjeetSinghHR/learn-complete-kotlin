fun main() {
    val result1 = Calculator() // Method to call class without constructor
    println(result1.add(10,10)) // Method to use function of a class
    println(result1.multiply(10,10)) // Method to use function of a class
    val result2 = Verification("Manjeet Singh", 24) // Call a class and define values
    println(result2.name) // There is a "Getter", It converts string value to upper case
    println(result2.age) // To print property
    result2.age = -5 // There is "Setter", So it returns "Age can't be negative"
}
class Calculator // There is no constructor
// If we didn't define a constructor in class then kotlin add its default constructor, and it's a parameterless constructor
{
    // var message:String - if we define properties like this, then it gives error because there must be an initial value of the property
    // In some cases we don't know what exact the initial value will be, so in such cases we use "late init" to prevent from error
    lateinit var message:String // There is no error now
    // There are some rules for "late init" -
    // 1. They can be only "var" types. We can't use "val" types.
    // 2. We can't make our properties - "Int", "Boolean" And "Float" Types.
    fun add(a:Int, b:Int):Int{
        return a + b // Method 1
    }
    fun multiply(a:Int, b:Int):Int{
        return a * b // Method 2
    }
}
// Uses of "Getters & Setters" -
class Verification(pName:String, pAge:Int)
{
    val name:String = pName // Let's add a "Getter"
        get() {
            return field.uppercase()
        }
    var age:Int = pAge // Let's add a "Setter"
        set(value) {
            if (value > 0){
                field = value
            }
            else {
                println("Age can't be negative")
            }
        }
}
// If we create a property and didn't add any getters and setters, then kotlin adds their default getters and setters
// Syntax of default Getters and Setters -
// get() = field
// set(value) { field = value }