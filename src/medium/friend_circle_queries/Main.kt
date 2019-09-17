package medium.friend_circle_queries

import java.util.*
// TODO: WORK IN PROGRESS
class FriendCircles {
    private val list = mutableMapOf<Int, Int>()
    private val nodesCount = mutableMapOf<Int, Int>()
    val rank = mutableMapOf<Int, Int>()

    private fun findRoot(i: Int): Int {
        val parent = list[i]!!
        return if (parent == i) i else {
            val result = findRoot(parent)
            list[i] = result
            result
        }
    }
    fun getMaxNode(): Int{
        return nodesCount.values.max()!!
    }

    fun addQuery(query: Array<Int>) {
        val a = query[0]
        val b = query[1]
        // If it's a new node we initialize it
        list.getOrPut(a) { a }
        list.getOrPut(b) { b }
        nodesCount.getOrPut(a) { 1 }
        nodesCount.getOrPut(b) { 1 }

        val rootA = findRoot(a)
        val rootB = findRoot(b)

        if (rootA != rootB) {
            list[rootA] = list.getValue(rootB)
            nodesCount[rootB] = nodesCount.getValue(rootB) + nodesCount.getValue(rootA)
            nodesCount.remove(rootA)
        }
    }

}



fun main() {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    val queries = Array(q) { Array(2) { 0 } }

    for (i in 0 until q) {
        queries[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }
    val friendCircles = FriendCircles()
    val maxArr = mutableListOf<Int>()
    for (query in queries){
        friendCircles.addQuery(query)
        maxArr.add(friendCircles.getMaxNode())
    }
    println(maxArr.joinToString("\n"))
}
