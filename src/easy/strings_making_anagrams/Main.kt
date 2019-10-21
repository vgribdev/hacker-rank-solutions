package easy.strings_making_anagrams

import java.util.*
import kotlin.math.absoluteValue

// Complete the makeAnagram function below.
fun makeAnagram(a: String, b: String): Int {
    val letters = mutableMapOf<Char, Int>()
    for (letter in a) {
        letters[letter] = letters[letter]?.let { it + 1 } ?: 1
    }

    for (letter in b) {
        letters[letter] = letters[letter]?.let { it - 1 } ?: -1
    }

    return letters.values.map { it.absoluteValue }.sum()
}

fun main() {
    val scan = Scanner(System.`in`)

    val a = scan.nextLine()

    val b = scan.nextLine()

    val res = makeAnagram(a, b)

    println(res)
}
