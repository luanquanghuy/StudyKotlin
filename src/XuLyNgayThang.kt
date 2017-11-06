import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    var calendar = Calendar.getInstance()
    var year = calendar.get(Calendar.YEAR)
    var month = calendar.get(Calendar.MONTH)
    var day = calendar.get(Calendar.DAY_OF_MONTH)
    println("Nam $year, Thang $month, Ngay $day")
    var date = calendar.time // vì calendar la kiểu Calendar mà simpleDateFormat format kiểu Date
    var simpleDateFormat = SimpleDateFormat("dd/MM/YYY HH:mm:ss aaa") // Định dạng 12h thì hh
    println(simpleDateFormat.format(date))
}