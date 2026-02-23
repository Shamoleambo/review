val name: String = "James"
var greeting: String? = "hello"

fun main() {

    when(greeting){
        null -> println("Oh snap")
        "hello" -> println(greeting)
    }
    println(name)
    println(greeting)

    greeting = null
    println(name + " says " + greeting)
}