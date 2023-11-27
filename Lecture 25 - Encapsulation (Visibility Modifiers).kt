fun main() {
    // By default, all functions & classes are public in kotlin and, they are known as Top level declarations.
    // There are four visibility modifiers - Public, Internal, Private and Protected.
    // Public - can be accessed in all other files and modules.
    // Internal - same like public, but can access only in same module (same project only).
    // Private - can be accessed only on the same class.
    // Protected - Cannot be used in root/top level declarations. It can work only inside the class.
    val obA = A() // Object A
    val obB = B() // Object B
    obA.p // accessible because public
    obB.r // accessible because internal
    // "q" and "s" are not accessible because -
    // "q" is private and can be accessed only on the same class
    // "s" is protected and cannot be accessed on top level declarations. Only accessible as a sub member on the class or function.
}
open class A
{
    public var p = 10
    private var q = 10
    internal var r = 10
    protected var s = 10
}
class B:A()
{
    fun test(){
        println(p) // public is accessible
        // println(q) --> Gives error because private can be accessible on the same class only.
        println(r) // // internal is accessible.
        println(s) // protected accessible because it's not in top level declaration.
    }
}