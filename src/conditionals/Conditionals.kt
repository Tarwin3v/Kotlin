package conditionals

fun main(args: Array<String>) {
    val age: Int = 21
    if (age < 18){
        println("You cannot register.")
    }else {
        println("You're good to go!")
    }
}