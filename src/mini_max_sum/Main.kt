package mini_max_sum
import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>) {
    val min = arr.map { it.toLong() }.toLongArray().sortedArray().sliceArray(0..3).sum()
    val max = arr.map { it.toLong() }.toLongArray().sortedArrayDescending().sliceArray(0..3).sum()
    print("$min $max")

}

fun main() {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}
