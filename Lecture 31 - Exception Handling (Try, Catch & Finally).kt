import java.lang.IllegalArgumentException
// When we execute our program then there is chances that the error may come. We can handle some errors but there may be some errors which we cannot handle.
// For E.g. --> If we are trying to make a connection from a database but the connection is not succeeding, there may be some problem in server end.
// In that case we can handle the error easily by showing the message "Please try after some time" to the user.
// In that case the app will not crash and all other function remains working.
// Another E.g. --> If we want to take an age input from the user which is only "Int" type, but the user put "String" value.
// In such case, if we are unable to handle this error then our app will be crashed.
// The errors which we can handle known as "Exceptions"
// Some errors we can't handle like - error in "JVM", Error in mobile "ram"
// There are 3 methods to handle the exceptions - [Try, Catch and Finally]
fun main () {
    // There are 3 elements in "a", we are trying to access the 5th element.
    // In that case our app will be crashed. We can solve the problem by these methods.
    val a = arrayOf(1,2,3)
    try {
        // we write the code inside the "try" block in which the error may be occurred.
        // We can't write "try" block alone, we need to write either "catch" or "finally" with it.
        // When we write code inside the "try" block and the code can produce error,
        // then the "catch" block executes and exception will handle easily.
        // "try" block will execute only when there is no error in the code.
        println(a[5])
    }
    catch (i: Exception){
        // "i" = Name, "Exception" = Name of exception.
        // (e: Exception){} --> This is our base class.
        // This will execute only if there is error in "try" code.
        // We can use multiple blocks of "catch" with "try" block.
        println("Please check the index number")
    }
    finally {
        // This block will execute definitely, either error comes or not.
        println("This will execute definitely, no matter what")
    }
    createList(5) // No error because the value is not negative.
    createList(-6) // Gives error because the value is negative.
}
// --> "Throw" - Sometime there is a scenario that as a developer we throw an exception intentionally.
// We throw the exception because we cannot handle it, and says to user that write it correctly to fix the error.
// In the below example - List value cannot be negative, if the value is negative
// then the Exception will be raised, otherwise list will be created successfully.
fun createList(count: Int) {
    if (count < 0){
        throw IllegalArgumentException("Value must be greater than 0")
    }
    else {
        println("User list created successfully")
    }
}
/*
Some common exception classes -

1. ArithmeticException
2. NullPointerException
3. IndexOutOfBoundsException
4. IllegalArgumentException
5. IllegalStateException
6. NoSuchElementException
7. FileNotFoundException
8. IOException
9. NumberFormatException
10. SecurityException

These are some of the common exception classes you might encounter when working with kotlin.
You can also create your own custom exception class by extending the built-in "Exception" class
or one of its subclasses to handle specific application related exceptions.
 */