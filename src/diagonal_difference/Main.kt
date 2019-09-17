package diagonal_difference

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*
import kotlin.math.absoluteValue

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var firstDiagonal = 0
    var secondDiagonal = 0
    // Write your code here
    for (i in arr.indices)
        firstDiagonal += arr[i][i]
    for (i in arr.indices)
        secondDiagonal += arr[arr.size - 1 - i][i]

    return (secondDiagonal - firstDiagonal).absoluteValue
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array(n) { Array(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
