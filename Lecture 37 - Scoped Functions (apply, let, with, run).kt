fun main() {
    val a = Employee()
    a.name = "MS"
    a.age = 24
    a.apply {
        name = "MS"
        age = 24
    }
    println(a.name)
    println(a.age)
    val b = a.let {
        println(it.name)
        println(it.age)
        2
    }
    println(b)
    val c:Employee? = null
    c?.name = "Singh"
    c?.age = 16
    c?.let {
        c.name = "Singh"
        it.age = 20
    }
    val d = Employee()
    with(d){
        name = "Singh"
        age = 20
    }
    d.run {
        name = "Singh"
        age = 23
    }
    d.also {
        it.name = "Singh"
        it.age = 24
    }
}
data class Employee(var name: String = "", var age: Int = 18)