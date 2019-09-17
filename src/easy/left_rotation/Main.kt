package easy.left_rotation

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    val nd = scan.nextLine().split(" ")
    val n = nd[0].trim().toInt()
    val d = nd[1].trim().toInt()
    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    val newA = a.slice(n - (n - d) until n).toMutableList()
    newA.addAll(a.slice(0 until d))
    println(newA.joinToString(" "))
}
