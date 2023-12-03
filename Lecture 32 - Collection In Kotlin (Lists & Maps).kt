fun main() {
    // In arrays, we cannot add or remove objects later because they are of fix sized. This is a disadvantage of array.
    // If we want to add objects in array, then we have to create a big size array and copy the elements in it, then we can insert values in it.
    // If we want a collection in which we can add, remove or change the values easily, then there is a list class in kotlin.
    // Index also auto managed in lists.
    // Two types of lists are there - Mutable and Immutable
    // In mutable list we can easily change, add or remove values. But in immutable list - Nothing can be changed, add or removed.
    // Why need of immutable list - In array we can update the values easily by accessing their index, but we cannot do this in immutable list.
    // Sometimes there is a list which we want nobody can change it, in that case we use immutable list.
    val a = listOf(1,2,3) // Its a immutable list.
    println(a[2]) // Print value by index
    println(a.indexOf(3)) // To print the index of the value
    println(a.contains(0)) // check if list contains "0" value, Gives boolean returns
    // a[1] = 2 --> Gives error because list is immutable.
    mutableList()
    maps()
}
fun mutableList() {
    val b = mutableListOf(1,2,3,4,5) // It's a mutable list
    b[0] = 6 // No error when we want to change the element.
    b.add(6) // To add element
    b.remove(4) // To remove element
    println(b)
    val a = listOf(10,11)
    b.addAll(a) // to add all elements of "a" in "b"
    println(b)
}
fun maps() {
    // Maps --> "Key - Value" Pair are known as maps. We use maps when we want to create a pair of "Key & Value"
    // There are also two types - Mutable & Immutable.
    val a = mutableMapOf<Int, String>() // It's a mutable map.
    // <------- Mutable maps are also known as dictionary ------->
    a.put(1, "MS") // Method 1 to add "key & value" to map
    a.put(2, "John")
    println(a.get(1)) // Method 1 to access the value by key
    println(a.get(5)) // Output will be "null" if the key doesn't exist in map
    a[3] = "Rock" // Method 2 to add "key & value" to map
    println(a[3]) // Method 2 to access the value by key
    // <------- We can also loop the maps ------->
    for ((i, j) in a) println("$i - $j")
    // <------- Immutable maps ------->
    val b = mapOf<Int, String>( // It's a immutable map
        1 to "Hello", // To add "key & value" to map
        2 to "World")
    println(b)
    println(b.size) // To print the size of the map
}
/*
There are many utility functions in maps and lists which can be used. Here are some of the common utility functions for lists and maps:
List Utility Functions -->

1. size: Returns the size of the list.
2. isEmpty: Checks if the list is empty.
3. contains: Checks if the list contains a specific element.
4. elementAt: Returns the element at a specific index.
5. first and last: Returns the first and last elements of the list.
6. filter: Returns a new list containing only the elements that match a given predicate.
7. map: Returns a new list by applying a transformation function to each element.
8. reduce and fold: Combine elements in the list using a binary operation.
9. sorted and reversed: Returns a new list sorted or reversed.
10. distinct: Returns a list with distinct elements.
11. groupBy: Groups elements into a map based on a given key selector.

Map Utility Functions -->

1. size: Returns the number of key-value pairs in the map.
2. isEmpty: Checks if the map is empty.
3. containsKey and containsValue: Checks if the map contains a specific key or value.
4. get: Retrieves the value associated with a specific key.
5. keys and values: Returns a collection of keys or values from the map.
6. entries: Returns a set of key-value pairs (entries).
7. filterKeys and filterValues: Returns a map containing only the key-value pairs that match a given predicate.
8. map: Returns a new map by applying a transformation function to each key-value pair.
9. toMutableMap and toImmutableMap: Converts a map to a mutable or immutable map.
10. plus: Combines two maps, where the keys in the second map may overwrite keys in the first map.
11. minus: Removes key-value pairs from a map.

These are just some of the commonly used utility functions for lists and maps in Kotlin.
Depending on your specific use case, you may find other functions provided by the Kotlin Standard Library that are useful for your tasks.
 */