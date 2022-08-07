package com.example.kotlinbasicsandadvanced.samples


/*
Here varargs allows us to pass multiple inputs considering only one argument on the calling function. Hence it avoids passing long list
 */

fun main() {
    val varargsObject = VarArgs()
    varargsObject.addAllNumbers(2,3,4,6,7,8)
}

class VarArgs {

    fun addAllNumbers(vararg data : Int) {
        var sum = 0
        for(i in data) {
            sum += i
        }
        print("Total sum is $sum")
    }
}