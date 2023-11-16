fun main() {
    // OOPs - Object-Oriented Programming
    // These help us to solve the problem with the help of objects
    // Class is a blueprint or template
    // Objects are the real thing
    // We create objects in our program, they interact with each others to solve the problem
    // Every object is different from each other
    val audi = Car("Audi","Petrol", 3590)
    val shift = Car("Shift Desire", "Diesel", 8760)
    // "audi" and "shift" these are objects
    println(audi.carName)
    println(audi.carType)
    println(shift.carName)
    println(shift.carType) // This is how we access the properties
    audi.driveCar()
    audi.applyBrakes()
    shift.driveCar()
    shift.applyBrakes() // This is how we access the function from a class
    println(audi.totalKms)
    println(shift.totalKms)
}
class Car (val carName:String, val carType:String, var totalKms:Int) // These are the properties
{
    fun driveCar(){
        println("$carName Is Driving")
    }
    fun applyBrakes(){
        println("$carName applied brakes successfully")
    }
}