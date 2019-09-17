package compare_the_triplets
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the compareTriplets function below.
fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var alice = 0
    var bob = 0
    for (i in 0..2) {
        if (a[i] > b[i])
            alice++
        else if (b[i] > a[i])
            bob++
    }
    return arrayOf(alice, bob)
}

fun main() {
    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = compareTriplets(a, b)

    println(result.joinToString(" "))
}
