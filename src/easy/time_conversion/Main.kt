package easy.time_conversion
import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    val isPm = s.contains("pm", ignoreCase = true)
    val time = s.slice(0 until s.length - 2)
    val times = time.split(":")
    var hours = times[0]
    val minutes = times[1]
    val seconds = times[2]
    if (!isPm && hours == "12")
        hours = "00"
    else if (isPm && hours != "12")
        hours = (hours.toInt() + 12).toString()
    return "$hours:$minutes:$seconds"

}

fun main() {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
