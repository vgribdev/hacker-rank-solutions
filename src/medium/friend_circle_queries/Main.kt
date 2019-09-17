package medium.friend_circle_queries
import java.util.*


// TODO: WORK IN PROGRESS
class FriendCircles(values: List<Int>) {
    private val list: MutableMap<Int, Int> = values.map { it to it }.toMap().toMutableMap()
    private val nodesCount: MutableMap<Int, Int> = values.map { it to 1 }.toMap().toMutableMap()
    private val rank: MutableMap<Int, Int> = values.map { it to 1 }.toMap().toMutableMap()
    var max = 0
        private set

    private fun findRoot(i: Int): Int {
        val parent = list[i]!!

        return if (parent == i) i else {
            val result = findRoot(parent)
            // list[i] = result
            result
        }
    }


    fun addQuery(query: Array<Int>) {
        val a = query[0]
        val b = query[1]

        val rootA = findRoot(a)
        val rootB = findRoot(b)

        val rankA = rank.getValue(rootA)
        val rankB = rank.getValue(rootB)

        val mainNode = if (rankA < rankB) rootB else rootA
        val smallerNode = if (rankA < rankB) rootA else rootB

        if (rootA != rootB) {
            // we add rootA to rootB
            list[smallerNode] = list.getValue(mainNode)
            nodesCount[mainNode] = nodesCount.getValue(mainNode) + nodesCount.getValue(smallerNode)
            // set max if necessary
            max = if (nodesCount[mainNode]!! > max) nodesCount[mainNode]!! else max
            if (rankA == rankB)
                rank[rootA] = rankA + 1
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
    val allData = queries.flatten().distinct()
    val friendCircles = FriendCircles(allData)
    val maxArr = mutableListOf<Int>()

    for (query in queries) {
        friendCircles.addQuery(query)
        maxArr.add(friendCircles.max)
    }

    println(maxArr.joinToString("\n"))
}
