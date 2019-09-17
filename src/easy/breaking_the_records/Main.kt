package easy.breaking_the_records

import java.util.*

// Complete the breakingRecords function below.
fun breakingRecords(scores: Array<Int>): Array<Int> {
    var maxScore: Int? = null
    var minScore: Int? = null
    var minScoreBreaks = 0
    var maxScoreBreaks = 0
    for (score in scores) {
        if (maxScore == null || minScore == null) {
            maxScore = score
            minScore = score
        }
        if (score > maxScore) {
            maxScore = score
            maxScoreBreaks++
        }
        if (score < minScore) {
            minScore = score
            minScoreBreaks++
        }
    }
    return arrayOf(maxScoreBreaks, minScoreBreaks)
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val scores = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = breakingRecords(scores)

    println(result.joinToString(" "))
}
