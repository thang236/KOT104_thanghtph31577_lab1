package com.example.thanghtph31577_lab1.ui.theme

fun main() {
//    vD1();
//    vD2();
//    vD3();
//    vD4();
//    vD5();
//    vD6();
//    vD7();
//    vD8();
//    vD9();
//    vD10();
        vd11();
}


fun vd11(){
    println("max 99 and -42 is: " + max(99, -42))
}
fun max(a: Int, b: Int) = if (a > b) a else b         // 1



fun vD1() {
    println("Hello, World!")
}

fun vD2() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(multiply(2, 4))
}
fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y



fun vD3(){
    infix fun Int.times(str: String) = str.repeat(this)        // phương thức ở rộng times có thể lawjo theo số lần int
    println(2 times "Bye ")                                    // 2

    val pair = "Ferrari" to "Katrina"                          // 3
    println(pair)

    infix fun String.onto(other: String) = Pair(this, other)   // 4
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia
}
class Person(val name: String) {
     val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) { likedPeople.add(other) }  // 6
}


class Customer                                  // 1
class Contact(val id: Int, var email: String)   // 2
fun vD4() {
    val customer = Customer()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6

}

fun vD5() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}
class MyClass

fun vD6(){
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }
}

fun vD7(){
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {                    // 1
        eatACake()
        cakesEaten ++
    }

    do {                                        // 2
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun vD8() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }
}
class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun vD9(){
    for(i in 0..3) {             // 1
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    print(" ")
}

fun vD10(){
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}






