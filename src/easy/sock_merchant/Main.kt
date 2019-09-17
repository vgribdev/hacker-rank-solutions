package easy.sock_merchant
import java.util.*
import kotlin.collections.*

// Complete the sockMerchant function below.
fun sockMerchant(ar: Array<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    for (a in ar) {
        map[a] = if (map.contains(a)) map[a]!! + 1 else 1
    }
    var totalCombinations = 0
    map.forEach {
        totalCombinations += (it.value - (it.value % 2)) / 2
    }
    return totalCombinations
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(ar)

    println(result)
}
