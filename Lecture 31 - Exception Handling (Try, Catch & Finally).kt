import java.lang.IllegalArgumentException

fun main () {
    val a = arrayOf(1,2,3)
    try {
        println(a[5])
    }
    catch (i:Exception){
        println("Please check the index number")
    }
    finally {
        println("This will execute definitely, no matter what")
    }
    createList(5)
    createList(-6)
}
fun createList(count: Int) {
    if (count < 0){
        throw IllegalArgumentException("Value must be greater than 0")
    }
    else {
        println("User list created successfully")
    }
}