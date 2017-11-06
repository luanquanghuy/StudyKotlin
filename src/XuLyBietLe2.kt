fun main(args: Array<String>) {
    var a : Int = 5
    var b : Int = 0
    try {
        println("$a / $b = ${chia(a.toDouble(), b)}")
    }
    catch (e: Exception){
        println(e.message)
    }
    println("Chay xong chuong trinh")
}
fun chia(a : Double, b : Int) : Double{
    if (b==0) throw Exception("Mau so bang 0")
    return a/b
}