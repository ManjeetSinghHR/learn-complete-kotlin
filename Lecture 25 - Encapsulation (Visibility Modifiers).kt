fun main() {
    val obA = A()
    val obB = B()
    obA.p
    obB.p
}
open class A
{
    public var p = 10
    private var q = 10
    internal var r = 10
    protected var s = 10
}
class B:A()
{
    fun test(){
        println(p)
        // println(q) Error
        println(r)
        println(s)
    }
}