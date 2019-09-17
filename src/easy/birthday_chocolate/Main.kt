package easy.birthday_chocolate

// Complete the birthday function below.
fun birthday(s: Array<Int>, d: Int, m: Int): Int {
    var combinations = 0
    for (i in 0 until s.size - m + 1)
        if (s.slice(i until i + m).sum() == d)
            combinations++
    return combinations

}

fun main() {
    readLine()!!.trim().toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val dm = readLine()!!.trimEnd().split(" ")

    val d = dm[0].toInt()

    val m = dm[1].toInt()

    val result = birthday(s, d, m)

    println(result)
}
