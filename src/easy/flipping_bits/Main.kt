import java.util.*
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

// Complete the flippingBits function below.
fun flippingBits(n: Long): Long {
    val bits = n.toString(2)
    val bitsWithCorrectLength = String(CharArray(32 - bits.length){'0'}) + bits
    val invertedBits = String(bitsWithCorrectLength.map {
        if (it == '0')
            '1'
        else
            '0'
    }.toCharArray())
    return invertedBits.toLong(2)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val n = scan.nextLine().trim().toLong()

        val result = flippingBits(n)

        println(result)
    }
}