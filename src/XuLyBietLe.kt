fun main(args: Array<String>) {
    var input : String?
    var a : Int = 0
    var b : Int = 0
    try {
        println("Nhap so a:")
        input = readLine()
        if(input != null){
            a = input.toInt()
        }
        println("Nhap so b:")
        input = readLine()
        if (input!=null) b = input.toInt()

            println("$a / $b = ${a/b}")
    }
    catch (e : Exception){
        println(e.message)
    }
    finally {
        println("Day la finally")
    }
}