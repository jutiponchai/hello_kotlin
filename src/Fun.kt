fun main(args: Array<String>) {
//    println("Hello Thailand")
//    var str = readLine()
//    println("OK you say : $str")

//    var fun1 = 5
//    println(fun1)
//    fun1 = 8
//    println(fun1)

//    var a = 1
//    var b = 100
//
//    var r = a..b

//    for (i in 1 until 10){
//        println("$i")
//    }

//    for (i in 10 downTo 1){
//        println("$i")
//    }
//
//    for (i in r){
//        println("Hello Thailand $i")
//    }
    var n = 101
    var result:String
    result = me(n)
    println("$n is $result")
}

fun me(a: Int) :String {
//    println("Test a function No.$a")
//    println("This is a function")
    if (a % 2 == 0)
        return "Even"
    else
        return "Odd"
}
