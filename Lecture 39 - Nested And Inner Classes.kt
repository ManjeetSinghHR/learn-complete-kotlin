fun main() {
    // Making a class inside a class known as "Nested" class.
    val a = Normal() // this is the object of Normal class
    a.a // Property
    val b = Normal.Nested() // object of Nested class
    b.test() // Function
    val c = Normal1().Nested() // Object of "Normal1" & "Nested" Class
    c.test() // Function
}
class Normal
{
    var a = 0
    class Nested{ // It's a nested class with no existence and this only work with "Normal Class"
        fun test(){
            println("I am in Nested Class") // we cannot access property of Normal class directly in Nested class. E.g. - "$a"
        }
    }
}
class Normal1
{
    var a = 0
    inner class Nested{ // We use "inner" keyword to access the property of "Normal1 Class"
        fun test(){
            println("I am in Nested Class $a") // "$a" property of "Normal1 Class"
        }
    }
}
// ---------> We generally use "Nested Class" in "Android Recycler View" When we define their "adapter" <---------