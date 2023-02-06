fun main(){
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val minNumber = listOf(a, b, c).min()
    val maxNumber = listOf(a, b, c).max()

    println("Minimum number is: $minNumber")
    println("Maximum number is: $maxNumber")
}