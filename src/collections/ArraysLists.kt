package collections

fun main(args: Array<String>) {
    //Arrays :: fixed length
    val array = arrayOf("Texas","Iowa","California")
    val mixed = arrayOf("Kotlin",17,3.0,true)
    val numbers = intArrayOf(17,22,33,57) // can only contain integers
    println(mixed[0])
    mixed[2] = 3.1415
    println(mixed[2])
    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada","Florida")
    val allStates = array + states

    println(allStates.size)

    val empty:Boolean = numbers.isEmpty()
    println(empty)

    if (states.contains("Kentucky")){
        println("It does contain Kentucky")
    }else {
        println("It does not contain Kentucky")
    }

    // List :: immutable we cant add & remove elts
    val list = listOf("Orange","Apple","Bananas")

    val arrayList = arrayListOf("Patrick","Mikael","Sarah")


    arrayList.add("Sandra") // add at the end
    arrayList.add(1,"Jack") // add the element at the place we want
    arrayList.remove("Mikael")

    println(list[0])
    println(arrayList)
    println(list + arrayList)
    println(arrayList.size)
    println(arrayList.isEmpty())
    println(arrayList.contains("Sarah"))

    val subList = arrayList.subList(1,4)
    println(subList)

}