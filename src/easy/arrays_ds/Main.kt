package easy.arrays_ds

import java.util.*

// Complete the reverseArray function below.
fun reverseArray(a: Array<Int>): Array<Int> {
    return a.reversed().toTypedArray()
}

fun main() {
    val scan = Scanner(System.`in`)

    scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}
