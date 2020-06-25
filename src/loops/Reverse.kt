package loops

fun main(args: Array<String>) {
    val numbers = listOf(1,2,3,6,8,9)
    print(reverse(numbers))

}

fun reverse(list: List<Int>) : List<Int> {
    val result = arrayListOf<Int>()
    for(i in list.size-1 downTo 0){
        result.add(list[i])
    }
    return result
}

