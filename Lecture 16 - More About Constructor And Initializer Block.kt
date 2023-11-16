fun main() {
    val ownerDetails1 = OwnerDetails(personName = "John", personAge = 22)
    val ownerDetails2 = OwnerDetails(personName = "Dany", personAge = 25)
    val ownerDetails3 = OwnerDetails(name = "Rohan", age = 23, city = "New Delhi", country = "India", haveCars = "Swift, Audi, Lamborghini")
    val ownerDetails4 = OwnerDetails(name = "Ajay", age = 29, city = "New Delhi", country = "India", haveCars = "Thar, Audi, Lamborghini")
    println(ownerDetails1.name)
    println(ownerDetails2.name)
    println(ownerDetails3.name)
    println(ownerDetails4.name)

}
class OwnerDetails(val name:String, val age:Int, val city:String, val country:String, val haveCars:String)
{
    init {
        println("$name is from City - $city And Country - $country")
    }
    init {
        println("$name is $age Years old")
    }
    init {
        println("$name have $haveCars")
    }
    constructor(personName:String, personAge:Int)
    :this(personName, personAge, "Los Angeles", "USA", "Audi, Mercedes, Jaguar")
}