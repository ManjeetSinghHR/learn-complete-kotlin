fun main() {
    /*
    Suppose we have a class of "Int" type which solve problems of "Int" type only.
    --> and in future if we need "String" type then we need to copy and paste this class and change its type.
    --> and if we need "Double" type then we have to follow these steps again.
    --> In such situation we have to create multiple classes for solving a same problem.
    --> These types of problems can be solved by "Generics" Classes.
    --> By the use of "Generics" we create only one class and pass the type which we need.
     */

    val a = IntClassNormal(5) // Int value
    a.getValue()
    val b = StringClassNormal("Singh") // String value
    b.getValue()
    val c = GenericClass(5) // "Int" value
    val d = GenericClass("Singh") // as well as "String" value
    c.getValue()
    d.getValue()
    add(1,2,3,4,5,6,7,8,9,10) // "Int" values
    add(1,1,1,1,1,1,1,1,1,1) // "Int" values
}
class IntClassNormal(var a: Int) { // Normal class which accepts only "Int" type
    fun getValue() {println(a)}
}
class StringClassNormal(var a: String) { // Normal class which accepts only "String" type
    fun getValue() {println(a)}
}
class GenericClass<Type>(var a:Type) // Generic class where we can define our required type.
{
    fun getValue() {println(a)}
}
fun add(vararg values: Int) { // "VARARG" - it means we can pass multiple values in it, of type which we defined. These values will be the array of that.
    var sum = 0
    for (i in values) {
        sum+= i
    }
    println(sum)
}