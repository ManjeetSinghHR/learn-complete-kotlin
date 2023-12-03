fun main() {
    // Extension Function --> If we needed to extend a class until now, we would create its subclass and define methods inside it.
    // Now, suppose there's a class stored in another library, and we want to extend it. We can only extend it if the class is open.
    // There is a new concept in kotlin named "Extension function", by using this we can define methods in class.
    // Important Note --> The methods which we define in a class, by these we cannot access the private members of the class,
    // because we define the function outside the class.
    println("My name is Manjeet Singh") // Normal print method
    println("My name is Manjeet Singh".formatString()) // print formatted with extension function
    calculateTime {
        loop(10000000)
    }
}
// So, if we want to define a method in "String" class, then we will define it like this -
fun String.formatString(): String
// "String" - Class name, "formatString" - Fun. name, ": String" - Return type
{
    return "------------------------------\n$this\n------------------------------"
    // "$this" --> It points the object, where we use the function. "$this" --> means "Current Object"
}
fun loop(a: Long)
{
    // It's a simple function, we pass value to "a", its loop and return.
    for (i in 1..a) {}
}
inline fun calculateTime(a:() -> Unit)
{
    // This function tells us that how much time "fun loop" takes in execution.
    val start = System.currentTimeMillis()
    a()
    val end = System.currentTimeMillis()
    println("Time taken is ${end - start}ms")
}
/*
Inline Function --> It's just a keyword.
--> When we run any function or code, then behind the scenes kotlin performs many processing to executes our program.
--> At first kotlin creates a class for the lambda. After that kotlin create its instance. And After that we are able to use it.
--> In kotlin, when we define lambdas in many places, then behind the scenes kotlin create classes of every lambda and create instances of every lambda.
--> So, if we are working on a big application in which there are too many lambdas, then it's a performance hit.
--> This application uses more memory. So this type of problem can be solved by a keyword known as "inline"
--> Syntax --> [inline fun calculate()]
--> So behind the scenes it will not create any instances. Its just paste the body of the function where kotlin needs the code of the function.
--> So it is used to improve the performance, so that kotlin don't create any extra objects.
 */