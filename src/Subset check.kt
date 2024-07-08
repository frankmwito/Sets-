import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)

    println("Enter the size of the first set:")
    val n1 = reader.nextInt()
    val set1 = mutableSetOf<Int>()

    for (i in 0 until n1){
        println("Enter the values of the first set:")
        set1.add(reader.nextInt())
    }

    println("Enter the size of the second set:")
    val n2 = reader.nextInt()
    val set2 = mutableSetOf<Int>()

    for (i in 0 until n2){
        println("Enter the values of the second set:")
        set2.add(reader.nextInt())
    }

    val isSubset1of2 = set2.containsAll(set1)
    val isSubset2of1 = set1.containsAll(set2)

    println("Is the first set a subset of the second set? $isSubset1of2")
    println("Is the second set a subset of the first set? $isSubset2of1")
}