fun main(args: Array<String>) {
//    for (i in 1..100)
//        println("Hello Thailand $i")
//    for (n in 10..100 step 10){
//        println("Hello World $n")
//        if (n > 50)
//            println("Oh Ho")
//    }
    var str = readLine()
    println("You just type : $str")

    while (!str.equals("bye")){
        str = readLine()
        println("you just type : $str")
    }
    println("ok, goodbye")

}