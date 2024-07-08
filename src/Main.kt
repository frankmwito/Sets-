import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)
    println("Enter any number")
    val n = reader.nextInt()
    val set = mutableSetOf<Int>()
    for (i in 0 until n){
        println("Enter the set values")
        set.add(reader.nextInt())
    }
    println(set)
}