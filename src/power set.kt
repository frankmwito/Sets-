import java.util.Scanner

fun <T> powerSet(set: Set<T>): Set<Set<T>> {
    var result = setOf(setOf<T>())
    for (element in set) {
        val newSubsets = result.map { it + element }
        result = result + newSubsets
    }
    return result
}

fun main() {
    val reader = Scanner(System.`in`)

    println("Enter the number of elements in the set:")
    val n = reader.nextInt()

    val originalSet = mutableSetOf<Int>()

    println("Enter the elements of the set:")
    for (i in 1..n) {
        originalSet.add(reader.nextInt())
    }

    val powerSetResult = powerSet(originalSet)
    println("The power set is:")
    println(powerSetResult)
}
