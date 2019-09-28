package easy.luck_balance

import java.util.*

// Complete the luckBalance function below.
fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    val unimportantContests = mutableListOf<Int>()
    val importantContests = mutableListOf<Int>()
    for (contest in contests) {
        if (contest[1] == 0)
            unimportantContests.add(contest[0])
        else
            importantContests.add(contest[0])
    }
    importantContests.sortDescending()
    val importantContestScore = if (k >= importantContests.size) importantContests.sum()
    else importantContests.subList(0, k).sum() - importantContests.subList(k, importantContests.size).sum()
    return unimportantContests.sum() + importantContestScore
}

fun main() {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val contests = Array(n) { Array(2) { 0 } }

    for (i in 0 until n) {
        contests[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = luckBalance(k, contests)

    println(result)
}
