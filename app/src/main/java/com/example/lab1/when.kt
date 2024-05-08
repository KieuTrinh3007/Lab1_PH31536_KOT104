package com.example.lab1

//fun main () {
//    cases("Hello")
//    cases(1)
//    cases(0L)
//    cases(MyClass())
//    cases("hello")
//    println(whenAssign("Hello"))
//    println(whenAssign(3.4))
//    println(whenAssign(1))
//    println(whenAssign(MyClass()))
//
//
//}

fun cases(obj: Any) {
    when (obj) {                                     // 1
        1 -> println("One")                          // 2
        "Hello" -> println("Greeting")               // 3
        is Long -> println("Long")                   // 4
        !is String -> println("Not a string")        // 5
        else -> println("Unknown")                   // 6
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

class MyClass


fun main () {
    println("\t\t\tWelcome to KOTLIN")
    println("1. Toán học \t 2. Văn học \t 3. Good bye")
    var chon: Int
    var nhapHopLe: Boolean

    do {
        println("Vui lòng chọn một danh mục (1-3): ")
        val nhap = readLine()
        chon = nhap?.toIntOrNull() ?: 0
        nhapHopLe = chon in 1..3
        if (!nhapHopLe) {
            println("Nhập không hợp lệ. Vui lòng nhập số từ 1 đến 3.")
        }
    } while (!nhapHopLe)

    if (chon == 3) {
        println("Tạm biệt!")
    } else {
        chooseQuestion(chon)
    }
}

fun chooseQuestion(chon: Int) {
    when (chon) {
        1 -> questionMath()
        2 -> questionLiterature()
    }
}

fun questionMath(){
    println("Câu hỏi về toán học : " +
            "2 con vịt đi trước 2 con vịt, " +
            "2 con vịt đi sau 2 con vịt, " +
            "2 con vịt đi giữa 2 con vịt. " +
            "Hỏi có bao nhiêu con vịt?")

    println("A. 6 \t B. 4 \t C. 2 \t D. 8")
    var answer = ""
    do {
        println("Vui lòng chọn A B C hoặc D")
        println("Đáp án của bạn là : ")
        var s = readLine()
        answer = s.toString()
    }while (s.toString().lowercase().equals("a").equals("b").equals("c").equals("d"))
    answerMath(answer.lowercase())

}

fun answerMath(obj : Any): Any {
    val result = when (obj) {
        "b" -> println("Hoàn toàn chính xác!");
        else -> println("Về học thêm đi!");
    }

    return result
}

fun questionLiterature() {
    println("Câu hỏi về văn học ( Điền vào chỗ trống ) : " +
            "Anh đi anh nhớ quê nhà, nhớ ... nhớ cà dầm xương.")
    println("A. Cơm mẹ nấu \t B. Bà hàng xóm \t C. Cô em gái \t D. Canh rau muống")
    var answer = ""
    do {
        println("Vui lòng chọn đáp án A B C hoặc D")
        println("Đáp án của bạn là : ")
        var s = readLine();
        answer = s.toString();
    }while (s.toString().lowercase().equals("a").equals("b").equals("c").equals("d"))
    answerLiterature(answer)

}
fun answerLiterature(obj: Any) : Any {
    val result = when(obj){
        "d" -> println("Bạn quá xuất sắc!")
        else -> println("Còn non và xanh lắm")
    }
    return result
}

