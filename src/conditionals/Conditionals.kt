package conditionals

import java.util.*

fun main(args: Array<String>) {
    val random = Random().nextInt(50) + 1
    when(random){
        in 1..10  -> println("random is between 1 & 10")
        in 11..20 -> println("random is between 1 & 10")
        in 21..30 -> println("random is between 1 & 10")
        in 31..40 -> println("random is between 1 & 10")
        else -> println("random is above 40")
    }
}