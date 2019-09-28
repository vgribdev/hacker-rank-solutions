package easy.minimum_absolute_difference_in_an_array
import java.util.*
import kotlin.math.absoluteValue

// Complete the minimumAbsoluteDifference function below.
fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    arr.sort()
    val diffArray = Array(arr.size - 1){0}
    for (i in 0 until arr.size - 1)
        diffArray[i] = (arr[i] - arr[i+1]).absoluteValue
    return diffArray.min()!!
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = minimumAbsoluteDifference(arr)

    println(result)
}
