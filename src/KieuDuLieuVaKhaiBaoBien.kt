import jdk.jfr.Unsigned

fun main(args: Array<String>) {
//    var thongTin : String = """
//        Luan Quang Huy
//        Lop KTPM
//        """
//    println(thongTin)
//    var ngaySinh : String? = "Luan Quang \"Huy\"\tLop Ktpm 16A\n"
//    print(ngaySinh)
//    var soNguyen : Int = 10
//    var soThuc : Double = soNguyen.toDouble()
//    print(soNguyen)
//    println(soThuc)
//    var a : Int = 811;
//    var b : Int = a.unaryMinus() //
//    var c : Int = a.unaryPlus()
//    println("a = $a\nb = $b\nc = $c")
//    var a : Int = 11
//    var b : Int = 8
//    println("a + b = ${a.plus(b)}")
//    println("a - b = ${a.minus(b)}")
//    println("a * b = ${a.times(b)}")
//    println("a / b = ${a.div(b)}")
//    println("a % b = ${a.rem(b)}")
//    var input : String?
//    var a : Double = 0.0
//    var b : Double = 0.0
//    println("Nhap số a: ")
//    input = readLine()
//    if(input!=null) a = input.toDouble()
//    println("Nhap số b: ")
//    input = readLine()
//    if (input!=null) b = input.toDouble()
////    if(a ==0.0 && b==0.0) println("Phương trình có vô số nghiệm")
////    else if(a == 0.0 && b != 0.0) println("Phương trình vô nghiệm")
////    else println("Phương trình có nghiệm x = ${b.unaryMinus()/a}")
//    var max = if (a>b) a else {
//        println("$b lớn hơn $a")
//        b
//    }
//    println("Giá trị lớn nhất là $max")
//    var month : Int = 2
//    var day  = when(month) {
//        1, 3, 5, 7, 8, 10, 12-> 31
//        2 -> 28
//        else -> 30
//    }
//    println("Thang $month co $day ngay")
    var dsPhuongTien = arrayOf("xe may", "o to", "cong nong", "xe dap", "xe buyt")
    for(i in dsPhuongTien.indices){
        println("Xe thu $i la ${dsPhuongTien.get(i)}")
    }
    for((index, value) in dsPhuongTien.withIndex()){
        println("Xe vi tri $index la $value")
    }


}