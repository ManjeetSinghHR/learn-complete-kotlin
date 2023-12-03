fun main() {
    // In some cases we don't know the value of the object, so we cannot assign value at that time.
    // So we use "null" in place of the value. Null means "absence of value"
    // When we create any object in modern programming lang. like - java and c#, and cannot assign value, then its by-default a null value.
    // When we execute the program with no value, then we get a null pointer exception [Which is an error].
    // So, kotlin is by-default a safe language, and save us from these errors.
    // val a: String = null - it gives error because of null value
    val a: String? = null // No error now, because we use "String?" - It's a null safe
    println(a)
    // a.uppercase() - It gives error, because value can be null.
    if (a != null) { a.uppercase() } // We can write like this to prevent from error.
    a?.uppercase() // This is the another method to access the properties of nullable objects. It is known as "Safe Call"
    // Ths "?" function, make sures before execute, that the object value is null or not.
    // If the value is Null, then it doesn't execute.
    // If we want to execute multiple statements, while ensuring that the object is null or not
    // So, in that case we use "let" operator with "null safe"
    a?.let {// no need to use "null safe operator" inside the "{}"
        println("Line 1")
        println("line 2 $a")
        println("Line 3 $it") // We can also access the object by "it", it points to "a"
    }
    // If we want to write a logic that if value of "a" is null then it take some default value which we provide
    // otherwise same value will be assigned. In such cases, we used "elvis operator"
    // Syntax --> [?: "value"]
    val b = a?:"Hello"
    // if "a" = null, then it takes "Hello" otherwise takes the provided value.
    // It is also known as "null collision" operator.
    println(b)
    // Not null asserted operator - Syntax --> "!!"
    // If the function is not null, then it calls the function, otherwise gives error to the user.
    // It means the function calls compulsory either it is null or not.
    // Use this only when you know that the object is not null, or you want to show the error.
    val c: String? = null
    // println(c!!.uppercase()) --> output will be an error, if we execute this because value is null.
}