fun main() {
    // If the behaviour is same, but class is different, then we use "Interface"
    // For E.g. - In below example, Circle, Square and Triangle all three are Shapes & All can drag.
    // Player is not a shape, but it can also drag
    // In case of class there can be only one parent which we can use.
    // But in interfaces, we can use multiple interface in one class, because a person can have multiple behaviours.
    // we can group all other classes with the help of interfaces.
    dragObjects(arrayOf(Circles(5.0), Squares(5.0), Triangles(5.0,5.0), Players("Singh")))
    callHuman()
}
fun dragObjects(objects: Array<Draggable>) // "Draggable" is an interface, and we used it here instead of "Shapes"
{
    for (result in objects)
        result.drag() // "drag()" is a function of "Interface"
}
interface Draggable // It's an interface
{
    fun drag() // If we didn't define body, then the function is automatically abstracted.
}
abstract class Shapes:Draggable
{
    abstract fun area()
}
class Circles(val radius: Double):Shapes() // Inherit with Shapes
{
    override fun area() {
        println(Math.PI * radius * radius)
    }

    override fun drag() {
        println("Circle Is Dragging")
    }
}
class Squares(val side: Double):Shapes() // Inherit with Shapes
{
    override fun area() {
        println(side * side)
    }

    override fun drag() {
        println("Square Is Dragging")
    }
}
class Triangles(val base: Double, val height: Double):Shapes() // Inherit with Shapes
{
    override fun area() {
        println(0.5 * base * height)
    }
    override fun drag() {
        println("Triangle Is Dragging")
    }
}
class Players(val name: String):Draggable // Inherit with Draggable, because we want to use their function with "Shape" class function
{
    override fun drag() { // Need to override
        println("$name is Dragging")
    }
}
// <----------------------------------------------- Example 2nd ----------------------------------------------->
fun callHuman() {
    hasHand1(arrayOf(P1(), P2(), Animal()))
}
fun hasHand1(name: Array<HasHand>)
{
    for (i in name)
        i.hasHand()
}
interface HasHand
{
    fun hasHand()
}
abstract class Human:HasHand
{
    abstract override fun hasHand()
}
class P1:Human()
{
    override fun hasHand() {
        println("P1 Has Hands")
    }
}
class P2:Human()
{
    override fun hasHand() {
        println("P2 Has Hands")
    }
}
class Animal:HasHand
{
    override fun hasHand() {
        println("Animal Has Hands")
    }
}