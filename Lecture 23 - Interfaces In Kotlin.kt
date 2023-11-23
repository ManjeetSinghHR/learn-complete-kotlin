fun main() {
    dragObjects(arrayOf(Circles(5.0), Squares(5.0), Triangles(5.0,5.0)))
}
fun dragObjects(objects: Array<Shapes>)
{
    for (result in objects)
        result.area()
}
abstract class Shapes
{
    abstract fun area()
    abstract fun drag()
}
class Circles(val radius: Double):Shapes()
{
    override fun area() {
        println(Math.PI * radius * radius)
    }

    override fun drag() {
        println("Circle Is Dragging")
    }
}
class Squares(val side: Double):Shapes()
{
    override fun area() {
        println(side * side)
    }

    override fun drag() {
        println("Square Is Dragging")
    }
}
class Triangles(val base: Double, val height: Double):Shapes()
{
    override fun area() {
        println(0.5 * base * height)
    }
    override fun drag() {
        println("Triangle Is Dragging")
    }
}