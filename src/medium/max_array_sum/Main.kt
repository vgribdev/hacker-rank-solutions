package  medium.max_array_sum
import java.util.*
import kotlin.math.max


fun maxSubsetSum(arr: Array<Int>): Int {
    arr[0] = max(0, arr[0])
    arr[1] = max(arr[0], arr[1])
    for (i in 2 until arr.size) arr[i] = max(arr[i - 1], arr[i] + arr[i - 2])
    return arr.last()
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = maxSubsetSum(arr)

    println(res)
}
