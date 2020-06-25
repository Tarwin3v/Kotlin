package oop

import java.util.*

class Person(val name: String, var age: Int) {
    var birthYear = 2020 - age

    init{
        println("Object instance of Person was created")
    }

    fun speak(){
        println("Hello! my name is $name & I'am $age")
    }

    fun greet(name: String){
        println("Hello $name!")
    }

    /*fun getYearOfBirth(): Int{
       return Date().year - age;
    }*/

    fun getYearOfBirth() = 2020 - age


}

fun main(args: Array<String>) {
    val person = Person("Peter",34)

    person.speak()
    person.greet("world")

    println(person.name)
    println("${person.name} is borned in ${person.getYearOfBirth()}")
}