package functions

import java.util.*

fun main(args: Array<String>) {
    helloWorld()
    printWithSpace("Kotlin is awesome!")
    println(getCurrentDate())
    println(max(42,32))
}

// no param  & no value returned
fun helloWorld() {
    println("Hello World!")
}

// kotlin => k o t l i n

// 1 param  & no value returned
fun printWithSpace(text: String){
    for(char in text) print("$char ")
    println()
}

// no param & returned value
fun getCurrentDate(): Date {
    return Date()
}

// 2 params & returned value
fun max(a: Int, b: Int): Int {
    return if( a > b){
        a
    }else {
        b
    }
}