import java.util.Scanner

fun main()  {
    val reader = Scanner(System.`in`)

    println("Enter the size of the first set:")
    val n1 = reader.nextInt()
    val set1 = mutableSetOf<Int>()

    println("Enter the size of the second set:")
    val n2 = reader.nextInt()
    val set2 = mutableSetOf<Int>()

    for (i in 0 until n1){
        println("Enter the values of the first set:")
        set1.add(reader.nextInt())
    }
    for (i in 0 until n2){
        println("Enter the values of the second set:")
        set2.add(reader.nextInt())
    }

    val symmetricDifference = (set1  union  set2) subtract  (set1.intersect(set2))

    if (!symmetricDifference.isEmpty()){
        println(symmetricDifference)
    }
    else{
        println("The set is empty $symmetricDifference")
    }
}