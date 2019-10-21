package medium.hash_tables_ice_cream_parlor

import java.util.*

// Complete the whatFlavors function below.
fun whatFlavors(costs: Array<Int>, money: Int) {
    val map = mutableMapOf<Int, Int>()
    for ((index, cost) in costs.withIndex()) {
        val foundIndex = map[money - cost]
        if (foundIndex != null) {
            println("${foundIndex + 1} ${index + 1}")
            return
        } else {
            map[cost] = index
        }
    }
}

fun main() {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()

        scan.nextLine().trim().toInt()

        val cost = scan.nextLine().trim().split(" ").map { it.trim().toInt() }.toTypedArray()

        whatFlavors(cost, money)
    }
}
