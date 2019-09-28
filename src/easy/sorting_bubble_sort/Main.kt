package easy.sorting_bubble_sort

import java.util.*

// Complete the countSwaps function below.
fun countSwaps(a: Array<Int>) {
    var totalSwaps = 0
    var sorted = false
    while (!sorted) {
        sorted = true
        // it's sorted if we scroll the array and we don't do a swap
        for (i in 0 until a.size - 1) {
            // Swap adjacent elements if they are in decreasing order
            if (a[i] > a[i + 1]) {
                val tmp = a[i]
                a[i] = a[i + 1]
                a[i + 1] = tmp
                totalSwaps++
                sorted = false
            }
        }
    }
    println("Array is sorted in $totalSwaps swaps.")
    println("First Element: ${a.first()}")
    println("Last Element: ${a.last()}")
}

fun main() {
    val scan = Scanner(System.`in`)

     scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countSwaps(a)
}

