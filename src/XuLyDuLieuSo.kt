import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

fun main(args: Array<String>) {
/*
    var d : Double = 10.0/3
    println(d)
    println("%.2f".format(d))
*/
    var x : Int = 435465463
    var dcf = DecimalFormat("#,###")
    var dcfs = DecimalFormatSymbols(Locale.getDefault())
    dcfs.groupingSeparator = ','
    dcf.decimalFormatSymbols = dcfs
    println(x)
    println(dcf.format(x))
}