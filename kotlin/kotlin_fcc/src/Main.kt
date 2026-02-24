val name: String = "James"
var greeting: String? = "hello"

fun main() {

    val greetingToPrint = when (greeting) {
        null -> "Hi"
        else -> greeting
    }

    println(greetingToPrint)

}