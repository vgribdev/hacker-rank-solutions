package easy.a_very_big_sum
import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sum()
}

fun main() {
    val scan = Scanner(System.`in`)
    scan.nextLine().trim().toInt()
    val ar = scan.nextLine().split(" ").map{ it.trim().toLong() }.toTypedArray()
    val result = aVeryBigSum(ar)
    println(result)
}
