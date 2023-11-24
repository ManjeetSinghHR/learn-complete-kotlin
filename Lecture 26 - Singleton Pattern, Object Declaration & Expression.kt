fun main() {
    val a = object{
        fun x() { println("I am object Expression") }
    }
    a.x()
    val b = object:X{
        override fun name() {
            super.name()
            println("Manjeet Singh")
        }
    }
    b.name()
    callX()
    increaseSocialLikes()
}
interface X { fun name() = println("I am in X Interface") }
object A1
{
    fun test() {println("I AM OBJECT A")}
}
fun callX() {
    val x = object:X1("Manjeet Singh"){
        override fun fullName() {
            super.fullName()
            println("John")
        }
    }
    x.fullName()
    val b = A1
    b.test()
}
open class X1(val name: String)
{
    open fun fullName() {
        println("Full Name - $name")
    }
}
fun increaseSocialLikes() {
    SocialLikes.increaseFBLikes()
    SocialLikes.increaseFBLikes()
    SocialLikes.increaseInstagramLikes()
    SocialLikes.increaseTwitterLikes()
    SocialLikes.displayLikes()
}
object SocialLikes
{
    private var fbLikes: Int = 0
    private var instagram: Int = 0
    private var twitter: Int = 0
    fun increaseFBLikes() { fbLikes++ }
    fun increaseInstagramLikes() { instagram++ }
    fun increaseTwitterLikes() { twitter++ }
    fun displayLikes() { println("FB Likes - $fbLikes, Instagram Likes - $instagram, Twitter Likes - $twitter") }
}