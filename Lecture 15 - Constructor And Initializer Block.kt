fun main() {
    // class Simple (val name:String,...) This (---) is known as constructor
    // a class have two main things - Properties & Methods
    val person1 = Person1()
    println(person1.age)
    println(person1.name)
    val person2 = Person2("MS",22)
    println(person2.pAge)
    println(person2.pName)
    val person3 = Automobile(carName = "Audi", carEngineType = "Petrol") // values for secondary constructor
    val person4 = Automobile("Swift",4, 5, "Diesel") // values for primary constructor
    println(person3.name)
    println(person4.name)
}
class Person1() // There is no constructor
{
    val name:String = ""
    var age:Int = 0
}
class Person2(name:String, age:Int)
{
    val pName:String = name
    var pAge:Int = age
}
class Automobile(val name:String, val tyres:Int, val maxSeating:Int, var engineType:String)
{
    init {
        println("$name Features - Max Seating Capacity - $maxSeating, Tyres - $tyres, Engine Type - $engineType")
    }
    init {
        println("This is 2nd initializer block")
    }
    constructor(carName:String, carEngineType:String) // This is secondary constructor
    :this(carName,tyres = 4, maxSeating = 5, carEngineType) // This is the method to call the primary constructor
    // It is compulsory to call the primary constructor after the secondary constructor
}