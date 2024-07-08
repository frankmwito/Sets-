import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter a string:")
    val input = reader.nextLine()  // Use nextLine() to read the entire line

    val distinctCharacters = input.toSet()  // Convert the string to a set of characters

    println("Set of distinct characters:")
    println(distinctCharacters)
}
