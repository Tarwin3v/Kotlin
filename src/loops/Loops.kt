package loops

fun main(args: Array<String>) {

    var sum = 0

    for ( i in 1..10) {
        sum += i
        println(sum)
    }

    val list = listOf("Java","Kotlin","Python")

    for (element in list){
        println(element)
    }

    for((index,value) in list.withIndex()) {
        println("$index : $value")
    }

    var x = 10
    while(x >= 0){
        println(x)
        x--
    }

    for ( char in "Python"){
        if (char == 'o'){
            break
        }
        println(char)
    }

    val list2 = listOf("Book","Table","Laptop")
    for (str in list2){
        if (!str.contains('o')){
            continue
        }
        println(str)
    }

}