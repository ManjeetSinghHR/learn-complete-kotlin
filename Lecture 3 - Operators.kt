fun main() {
    
    var x = 5
    var y = 2
    
// Arithmetic Operators -
    
// +	Addition	Adds together two values	x + y	
    println(x + y)
// -	Subtraction	Subtracts one value from another	x - y	
    println(x - y)
// *	Multiplication	Multiplies two values	x * y	
    println(x * y)
// /	Division	Divides one value from another	x / y	
    println(x.toFloat() / y) // toFloat() Uses to convert int to floating point
// %	Modulus	Returns the division remainder	x % y	
    println(x % y)
// ++	Increment	Increases the value by 1	++x	
    x++ // 5+1 = 6
    println(x + y)
    // ++x Is Pre Increment And x++ Is Post Increment
// --	Decrement	Decreases the value by 1	--x
    x-- // 6-1 = 5
    println(x - y)
    // --x Is Pre Increment And x-- Is Post Increment
    
// Kotlin Comparison Operators -
    
// ==	Equal to	x == y	
    println(x == y) // false
// !=	Not equal	x != y	
    println(x != y) // true
// >	Greater than	x > y	
    println(x > y) // true
// <	Less than	x < y	
    println(x < y) // false
// >=	Greater than or equal to	x >= y	
    println(x >= y) // true
// <=	Less than or equal to	x <= y
    println(x <= y) // false
 
// Kotlin Logical Operators -
    
// &&   and	Returns true if both statements are true
    var A = 2
    println(A > 1 && A < 3) // true
    println(A > 1 && A < 1) // false
// || 	or	Returns true if one of the statements is true
    println(A > 1 || A > 5) // true
    println(A > 5 || A > 8) // false
// !	not	Reverse the result, returns false if the result is true
    var AA = true
    println(!AA)
    
}