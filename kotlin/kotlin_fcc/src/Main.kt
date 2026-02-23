val name: String = "James"
var greeting: String? = "hello"

fun main() {
    println(name)
    println(greeting)

    greeting = null
    println(name + " says " + greeting)
}