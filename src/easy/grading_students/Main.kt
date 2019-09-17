package easy.grading_students

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    return grades.map {
        val nextFive = ((it - (it % 5)) / 5 + 1) * 5
        when {
            it < 38 -> it
            nextFive - it < 3 -> nextFive
            else -> it
        }
    }.toTypedArray()
}

fun main() {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array(gradesCount) { 0 }
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
