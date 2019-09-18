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
            var i = 3
            var found = false
            while(i<=sqrt(n.toDouble()).toInt() && !found){
                if (n % i == 0)
                    found = true
                i++
            }
            !found
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
