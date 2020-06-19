package com.kotlinexample


fun main() {

    val listing = listOf("banana", "strawberry", "pineapple").joinToString(
        separator = ";",
        prefix = "{",
        postfix = "}",
        limit = 2,
        truncated = "etc"
    ) {
        it.toUpperCase()
    }
    print(listing)
}