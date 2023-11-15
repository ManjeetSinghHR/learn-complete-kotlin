fun main() {
  
    // 1. Variables Are Used To Store The Data With Name
    // 2. Two Types Of Variables Are Used In Kotlin
    // A. var - It's Data Can Be Re-Assigned.
    // B. val - It's Data Cannot Be Re-Assigned.
    
    var MS = "Manjeet Singh"
    MS = "Mr. Singh"
    println(MS)
    
    val MS1 = "5"
    // MS1 = "9" - Gives Error If We Try To Re-Assigned.
    println(MS1)
    
   // Data Types - There are 4 types of data
  
   // Integer (Byte, Short, Int, Long) - For Storing Numbers Only Without Decimal - (+VE & -VE)
   // A. The Byte data type can store whole numbers from -128 to 127
      
   var NUM1: Byte = -128
   println(NUM1)    
   
   var NUM2: Byte = 127
   println(NUM2)   
      
   // B. The Short data type can store whole numbers from -32768 to 32767
      
   var NUM3: Short = -32768
   println(NUM3)    
   
   var NUM4: Short = 32767
   println(NUM4) 
      
   // C. The Int data type can store whole numbers from -2147483648 to 2147483647
      
   var NUM5: Int = -2147483648
   println(NUM5)    
   
   var NUM6: Int = 2147483647
   println(NUM6) 
      
   // D. The Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807
      
   var NUM7: Long = -9223372036854775807
   println(NUM7)    
   
   var NUM8: Long = 9223372036854775807
   println(NUM8)   
      
   // Floating Point (Float, Double) - For Storing Numbers Only With Decimal - (+VE & -VE)
   // A. In Float, After The Decimal Point, We Can Use only six or seven decimal digits. Also note that you should end the value of a Float type with an "F"
      
   var NUM9: Float = 10.123456F
   println(NUM9)   
      
   // B. In Double, After The Decimal Point, We Can Use about 15 digits.
      
   var NUM10: Double = 10.123456789101112
   println(NUM10)  
      
   // Boolean (True, False) - For Storing Values In True Or False Only
   // We Can Store Either True Or False Only.
      
   var Is_Raining: Boolean = true    
   println(Is_Raining)   
      
   // Characters (Char, String) - For Storing Values In Characters
   // A. The Char data type is used to store a single character. A Char value must be surrounded by single quotes, like 'A' or 'c'
      
   var Text1: Char = 'A'    
   println(Text1)   
      
   // B. The String data type is used to store a sequence of characters (text). String values must be surrounded by double quotes, like "Hello, How Are You?"    
   
   var Text2: String = "My Name Is Manjeet Singh, I am 24 Years Old. \nI Am A Software Engineer."    
   println(Text2)
      
  }
