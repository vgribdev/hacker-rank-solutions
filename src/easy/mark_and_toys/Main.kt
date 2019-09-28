package easy.mark_and_toys

import java.util.*

// Complete the maximumToys function below.
fun maximumToys(prices: Array<Int>, k: Int): Int {
    prices.sort()
    var toys = 0
    var totalSpent = 0
    var i = 0
    while (i < prices.size && prices[i] + totalSpent <= k) {
        totalSpent += prices[i]
        toys++
        i++
    }
    return toys
}

fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val prices = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = maximumToys(prices, k)

    println(result)
}
