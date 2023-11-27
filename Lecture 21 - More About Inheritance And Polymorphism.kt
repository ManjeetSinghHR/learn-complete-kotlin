fun main() {
    // In computer science, it is defined as method name is same, but it will behave differently based on the object.
    // Inheritance & Polymorphism -
    // 1. Both do work with together.
    // 2. So whenever shape is required, we can easily pass Circle, Square and Triangle. Because they all inherit from shape.
    // 3. But we cannot pass Shape object where Circle is required. Because all shapes are not circle.
    // 4. A parent class can't be a child class.
    val shape = Shape1()
    val square = Square1(5.0)
    printArea(shape)
    printArea(square)
    val shape1 = Shape()
    // printArea1(shape1) - It gives error because all shapes are not Circle.
    // How Compiler checks and calls method - It first checks in child class, after that in parent class and at last in Super class "ANY"
    // Let's understand with an example - we call a "toString" method, we know there is no method available in our child and parent class and
    // this method is available only in "ANY" class, So the compiler checks one by one and then calls the method.
    val checkMethod = Triangle1(7.0,8.0)
    println(checkMethod.toString())
}
fun printArea(shape:Shape1){
    println(shape.area())
}
fun printArea1(shape:Circle){
    println(shape.area())
}
open class Shape1
{
    open fun area():Double{
        return 0.0
    }
}
class Circle1(val radius: Double):Shape1()
{
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class Square1(val side: Double):Shape1()
{
    override fun area(): Double {
        return side * side
    }
}
class Triangle1(val base: Double, val height: Double):Shape1()
{
    override fun area(): Double {
        return 0.5 * base * height
    }
    override fun toString(): String {
        return "Override Success"
    }
}