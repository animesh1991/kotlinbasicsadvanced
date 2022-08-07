package com.example.kotlinbasicsandadvanced.samples

/*
This program will help you understand the need of geneic data types here we are creating two class IntContainer and StringContainer which
are bound to particular data type, so in future if there is any request which tells to create another class with same functionality for differnt
data type we will have to create one more class for it making code not efficient. So to avoid this we take the help of generics. by creating
a class which takes any data type as parameter and implement our functionality
 */

/*
Most of our collection classes are generic in nature for example
    val list = ArrayList<Int>()
    val listOfStrings = ArrayList<String>()
 */

fun main() {

    val intContainer = IntContainer(10)
    println(intContainer.data)

    val stringContainer = StringContainer("Hello Animesh")
    println(stringContainer.data)
    stringContainer.data = "Hello ElementOp"
    println(stringContainer.data)

    val genericContainer = GenericContainer(100)
    println(genericContainer.data)
}


data class IntContainer(var data : Int)

data class StringContainer(var data : String)

data class GenericContainer<T>(var data : T)