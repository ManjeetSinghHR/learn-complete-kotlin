fun main() {
    // Inheritance - we get some characteristics from our parents and our parents also get some characteristics from their parents is known as "Inheritance"
    // For E.g. If I have a class of basic phone containing features - volume, make call, display on off, power on off, screen info
    // And if I want to make a smartphone class which contains all common features of basic phone and some additional features.
    // Then I have to write all common features again and again in every class.
    // To solve problems like that we use inheritance.
    // By the help of inheritance, we can simply use the common features instead to writing all code again and again.
    val result = Child()
    result.myMethod2()
    result.myMethod1()
}
open class BasicPhn() // "open" it allows us to inherit the class
{
    val name:String = ""
    val type:String = ""
    val volume:Int = 10

    fun makeCall(){}
    fun display(){}
    fun powerOff(){}
    fun getDeviceInfo(){}
}
class SmartPhone:BasicPhn() // :BasicPhn() - To call the parent class
{                           // SmartPhone is a "Child class" And BasicPhn is a "Parent class"
    fun getLocation(){}
    fun takeScreenshot(){}
    fun playVideo(){}
}
open class Parent()
{
    init {
        println("Parent Constructor is called")
    }
    fun myMethod1(){
        println("I am in Parent")
    }
}
class Child:Parent()
{
    init {
        println("Child Constructor is called")
    }
    fun myMethod2(){
        println("I am in Child")
    }
}
// Parent constructor is always called first, then after child constructor will call.
// A child class can only be one parent class.