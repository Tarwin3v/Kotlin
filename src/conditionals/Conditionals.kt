package conditionals

fun main(args: Array<String>) {
    val x = 9
    when(x){
        5 -> println("x is 5.")
        3*12 -> println("x is 3*12")
        "Hey there".length -> {
            println("x is the length of the string 'Hey there'")
        }
        in 1..10 -> println("x is between 1 & 10 ")
        in 11..20 -> println("x is between 11 & 20 ")
        !in 1..9 -> println("x is not between 1 & 9 ")

    }

}