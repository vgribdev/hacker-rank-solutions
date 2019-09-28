package medium.greedy_florist

import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the getMinimumCost function below.
fun getMinimumCost(friends: Int, c: Array<Int>): Int {
    val friendsFlowersMap = Array(friends) {
        mutableListOf<Int>()
    }
    val sortedArray = c.sortedArrayDescending()
    for ((i, n) in sortedArray.withIndex()) {
        val currentFriendList = friendsFlowersMap[i % friends]
        currentFriendList.add((currentFriendList.size + 1) * n)
    }
    return friendsFlowersMap.flatMap { it }.sum()

}

fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val minimumCost = getMinimumCost(k, c)

    println(minimumCost)
}
