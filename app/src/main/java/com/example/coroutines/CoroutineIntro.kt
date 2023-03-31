package com.example.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CoroutineIntro {

}

fun main(args: Array<String>) {
    UI()
    GlobalScope.launch {
        Bg()
    }
    UI()
    Thread.sleep(2000)
}

fun UI() {
    println("UI update")
}

suspend fun Bg() {
    delay(1000)
    println("Network Call")
}

