package easy.dynamic_array
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'dynamicArray' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. 2D_INTEGER_ARRAY queries
 */

fun dynamicArray(n: Int, queries: Array<Array<Int>>): Array<Int> {
    // Write your code here
    val sequences = Array(n) { mutableListOf<Int>() }
    val solutions = mutableListOf<Int>()
    var lastAnswer = 0
    for (query in queries) {
        val type = query[0]
        val x = query[1]
        val y = query[2]
        val seq = sequences[(x xor lastAnswer) % n]

        if (type == 1) {
            seq.add(y)
        } else if (type == 2) {
            lastAnswer = seq[y % seq.size]
            solutions.add(lastAnswer)
        }
    }
    return solutions.toTypedArray()
}

fun main() {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    val n = firstMultipleInput[0].toInt()

    val q = firstMultipleInput[1].toInt()

    val queries = Array(q) { Array(3) { 0 } }

    for (i in 0 until q) {
        queries[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = dynamicArray(n, queries)

    println(result.joinToString("\n"))
}
