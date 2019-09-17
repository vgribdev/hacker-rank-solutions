package easy.twod_array_ds

import java.util.*

// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {
    var max: Int? = null
    for (i in 0 until arr.size - 2) {
        for (j in 0 until arr.size - 2) {
            val total =
                arr[i][j] +
                        arr[i][j + 1] +
                        arr[i][j + 2] +
                        arr[i + 1][j + 1] +
                        arr[i + 2][j] +
                        arr[i + 2][j + 1] +
                        arr[i + 2][j + 2]
            if (max == null) {
                max = total
            } else if (total > max)
                max = total
        }
    }
    return max!!
}

fun main() {
    val scan = Scanner(System.`in`)

    val arr = Array(6) { Array(6) { 0 } }

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
