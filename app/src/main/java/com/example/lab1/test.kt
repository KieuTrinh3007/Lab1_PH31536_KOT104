package com.example.lab1

fun main () {
    // khai báo và sử dụng biến
    val a = 1
    // a = 2
    var b = 2
    b = 3

    val c = (a + b)
    val d : String = "Tổng 2 số $a và $b : $c"

    println(d)
    var kq = phepChia(1, 3f);
    println(kq)

    val arrX = intArrayOf(1,2,3,4)

    arrX[arrX.size - 1] = 5

    println(arrX.asList())

    for (i in arrX.indices){
        println("Phần tử thứ $i trong mang là : ${arrX[i]}")
    }
}

fun phepChia (soA: Int, soB : Float) : String {

    if(soB == 0f){
        return  "Số B phải khác 0!"
    }

    val c = soA / soB
    return "Thương 2 số $soA và $soB " + "= ${String.format("%.2f" , c)}"


}