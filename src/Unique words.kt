import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter a string:")
    val input = reader.nextLine()

    // Split the input string into words and convert to lower case
    val words = input.split("\\s+".toRegex()).map { it.lowercase() }

    // Create a set of unique words
    val uniqueWords = words.toSet()

    println("Unique words: $uniqueWords")
}
