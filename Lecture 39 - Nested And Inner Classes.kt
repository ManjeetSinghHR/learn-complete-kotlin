fun main() {
    val a = Normal()
    a.a
    val b = Normal.Nested()
    b.test()
    val c = Normal1().Nested()
    c.test()
}
class Normal
{
    var a = 0
    class Nested{
        fun test(){
            println("I am in Nested Class")
        }
    }
}
class Normal1
{
    var a = 0
    inner class Nested{
        fun test(){
            println("I am in Nested Class $a")
        }
    }
}