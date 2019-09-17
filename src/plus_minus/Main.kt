package plus_minus

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

// Complete the plusMinus function below.
fun plusMinus(arr: Array<Int>) {
    val positives = arr.filter { it > 0 }.size.toDouble()
    val negatives = arr.filter { it < 0 }.size.toDouble()
    val zeroes = arr.filter { it == 0 }.size.toDouble()
    println(BigDecimal(positives / arr.size).setScale(6, RoundingMode.HALF_EVEN))
    println(BigDecimal(negatives / arr.size).setScale(6, RoundingMode.HALF_EVEN))
    println(BigDecimal(zeroes / arr.size).setScale(6, RoundingMode.HALF_EVEN))
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
