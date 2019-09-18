package medium.time_complexity_primality

import java.util.*
import kotlin.math.sqrt

// Complete the primality function below.
fun primality(n: Int): String {
    val isPrime = when {
        n < 2 -> false
        n == 2 ->  true
        n % 2 == 0 -> false
        else -> {
            for (i in 3..sqrt(n.toDouble()).toInt() step 2)
                if (n % i == 0)
                    return false
            return true
        }
    }
    return if (isPrime) "Prime" else "Not prime"
}

fun main() {
    val scan = Scanner(System.`in`)

    val p = scan.nextLine().trim().toInt()

    for (pItr in 0 until p) {
        val n = scan.nextLine().trim().toInt()

        val result = primality(n)

        println(result)
    }
}
