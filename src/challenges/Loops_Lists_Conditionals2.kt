package challenges

fun main(args: Array<String>) {
    val list = arrayListOf("Ainsi parlait zarathoustra","La coupe de feu","Les croisades vues par les arabes")
    for(str in list){
        if(str.contains('e')){
            for(char in str){
                println(char)
            }
        }
    }
}