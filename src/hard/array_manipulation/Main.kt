package hard.array_manipulation

import java.util.*

// Complete the arrayManipulation function below.
fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    val newArr = LongArray(n + 1) { 0 }
    for (query in queries) {
        val k = query[2].toLong()
        newArr[query[0] - 1] += k
        newArr[query[1]] += -k
    }

    var max = 0L
    var oldValue = 0L
    for (value in newArr) {
        val currentValue = oldValue + value
        if (currentValue > max)
            max = currentValue
        oldValue = currentValue

    }
    return max
}

fun main() {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val queries = Array(m) { Array(3) { 0 } }

    for (i in 0 until m) {
        queries[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = arrayManipulation(n, queries)

    println(result)
}
