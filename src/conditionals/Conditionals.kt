package conditionals

fun main(args: Array<String>) {
    val mode: Int = 4

    when (mode) {
        1 -> println("The mode is lazy.")
        2 -> println("The mode is busy.")
        3 -> {
            println("The mode is super-productive.")
        }
        else -> println("What are you?")
    }

}