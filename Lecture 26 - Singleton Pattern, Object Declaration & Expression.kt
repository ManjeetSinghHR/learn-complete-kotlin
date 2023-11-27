fun main() {
    // Like classes, we can create objects directly.
    // Can also create functions in object.
    // <----- Some Key Points ----->
    // 1. Cannot create multiple objects with the same name.
    // 2. No Constructors are allowed.
    // 3. "Init" block is allowed.
    // 4. We can inherit classes and interface.
    // 5. They Follow "Singleton Pattern".
    // <----------------------------------------------- ----------------------------------------------->
    // More about "Singleton Pattern" -
    // It means a class can create the object only at once and, it's multiple objects can't be created known as "Singleton Pattern"
    val a = object{ // It's an anonymous object. It's replacement of java's anonymous "Inner" class
        fun x() { // We can also define functions in anonymous object.
            println("I am object Expression")
        }
    }
    a.x() // calling function from anonymous object
    // <----------------------------------------------- ----------------------------------------------->
    // We can also use interfaces directly in our anonymous object
    val b = object:X{
        override fun name() {
            super.name()
            println("Manjeet Singh")
        }
    }
    b.name() // calling function
    callX()
    increaseSocialLikes()
}
// ............................................... Interface X ...............................................
interface X
{
    fun name() {
        println("I am in X Interface")
    }
}
// ............................................... Object A1 ...............................................
object A1 // Simple object Syntax
{
    fun test() { // Function in object
        println("I AM OBJECT A")
    }
}
// ............................................... Function CallX ...............................................
fun callX() {
    val x = object:X1("Manjeet Singh"){
        override fun fullName() {
            super.fullName()
            println("John")
        }
    }
    x.fullName()
    val b = A1 // Calling object
    b.test() // access function of object
}
// ............................................... Open Class X1 ...............................................
open class X1(val name: String)
{
    open fun fullName() {
        println("Full Name - $name")
    }
}
// ............................................... Function Increase Social Likes ...............................................
fun increaseSocialLikes()
{
    SocialLikes.increaseFBLikes()
    SocialLikes.increaseFBLikes()
    SocialLikes.increaseInstagramLikes()
    SocialLikes.increaseTwitterLikes()
    SocialLikes.displayLikes()
}
// ............................................... Object Social Likes ...............................................
object SocialLikes
{
    private var fbLikes: Int = 0
    private var instagram: Int = 0
    private var twitter: Int = 0
    fun increaseFBLikes() {
        fbLikes++
    }
    fun increaseInstagramLikes() {
        instagram++
    }
    fun increaseTwitterLikes() {
        twitter++
    }
    fun displayLikes() {
        println("FB Likes - $fbLikes, Instagram Likes - $instagram, Twitter Likes - $twitter")
    }
}