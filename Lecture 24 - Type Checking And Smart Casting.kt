fun main() {
    callNew()
    val c:Array<OR> = arrayOf(NewPlayer("Singh"), NewCircle(5.0), NewCircle(6.0), NewCircle(7.0))
    for (i in c) if (i is NewCircle) println(i.area()) else (i as NewPlayer).sayMyName()
}
fun callNew() {
    val a = NewCircle(2.0)
    val b = NewPlayer("Manjeet Singh")
    println(a.area())
    b.drag()
}
interface OR { fun drag() }
abstract class Calculate:OR { abstract fun area():Double }
class NewCircle(val radius:Double):Calculate() {
    override fun drag() = println("Circle is dragging")
    override fun area(): Double = Math.PI * radius * radius
}
class NewPlayer(val name:String):OR{
    override fun drag() = println("${name.uppercase()} Is Dragging")
    fun sayMyName() = println("Hey my name is - ${name.uppercase()}")
}