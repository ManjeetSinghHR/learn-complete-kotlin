fun main() {
    // It helps to write maintainable and extensible code
    // Helps in interacting with objects via common interface
    val circle:Circle = Circle(4.0)
    val square:Square = Square(5.0)
    val triangle:Triangle = Triangle(2.0,6.0)
    println("Area of Circle = ${circle.area()}\nArea of Square = ${square.area()}\nArea of Triangle = ${triangle.area()}")
    // let's polymorphism all upper "val"
    val circle1:Shape = Circle(4.0)
    val square1:Shape = Square(5.0)
    val triangle1:Shape = Triangle(2.0,6.0)
    println("Area of Circle = ${circle1.area()}\nArea of Square = ${square1.area()}\nArea of Triangle = ${triangle1.area()}")
    val shapes1 = arrayOf(Circle(5.0), Square(6.0), Triangle(4.0,7.0))
    calculateAreas(shapes1)
}
fun calculateAreas(shapes: Array<Shape>){
    for (i in shapes){
        println(i.area())
    }
}
open class Shape
{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius: Double):Shape()
{
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
class Square(val side: Double):Shape()
{
    override fun area(): Double {
        return side * side
    }
}
class Triangle(val base: Double, val height: Double):Shape()
{
    override fun area(): Double {
        return 0.5 * base * height
    }
}