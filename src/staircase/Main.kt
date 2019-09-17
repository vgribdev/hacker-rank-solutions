package staircase
import java.util.*

// Complete the staircase function below.
fun staircase(n: Int) {
    for (i in 1..n) {
        val arr = CharArray(n) {
            if (it < n - i) ' '
            else '#'
        }
        println(arr.joinToString(""))
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
