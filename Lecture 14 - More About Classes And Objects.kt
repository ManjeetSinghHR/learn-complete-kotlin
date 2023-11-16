fun main() {
    // Let's create a program which identifies can a person vote or not
    // for that we have to make a person class with person properties like - name, age etc.
    // after that we create a function which checks the person can vote or not
    val person1 = Person("John", 19)
    val person2 = Person("Robin",16)
    println(person1.canVote())
    println(person2.canVote())
    // We can more clear its output
    if (person1.canVote()) println("${person1.personName} is eligible for vote") else println("${person1.personName} is not eligible for vote")
    if (person2.canVote()) println("${person2.personName} is eligible for vote") else println("${person2.personName} is not eligible for vote")
    person2.personAge = 22 // we can change the value
    if (person2.canVote()) println("${person2.personName} is eligible for vote because he is now ${person2.personAge} years old")
    else println("${person2.personName} is not eligible for vote")
}
class Person (val personName:String, var personAge:Int) // These are Person properties
{
    fun canVote():Boolean{ // This checks if the person can vote or not
        return personAge > 18
    }
}