package easy.between_two_sets

/*
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */

fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    // Write your code here
    val maxInt = intArrayOf(a.max()!!, b.max()!!).max()!!
    val minInt = intArrayOf(a.min()!!, b.min()!!).min()!!
    val goodNumbers = mutableListOf<Int>()
    for (i in minInt..maxInt) {
        if (a.find { i % it != 0 } == null && b.find { it % i != 0 } == null)
            goodNumbers.add(i)
    }
    return goodNumbers.size
}

fun main() {
    val firstMultipleInput = readLine()!!.trimEnd().split(" ")

    firstMultipleInput[0].toInt()

    firstMultipleInput[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
