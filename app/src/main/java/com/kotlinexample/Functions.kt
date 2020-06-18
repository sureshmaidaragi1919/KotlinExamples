package com.kotlinexample

/*
Entry point of the application is the main function in Kotlin
Noted: Kotlin ; is not required at end of line or statement
 */


fun sum(a: Int, b: Int): Int {
    return a + b
}

/*Function returning no meaningful value:*/
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}


/*
Variable number of arguments (Varargs)*/
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

fun main() {
    val list = asList(1, 2, 3)
    println("$list")
}