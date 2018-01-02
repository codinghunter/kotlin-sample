package org.kotliner.demo.coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

/**
 * @author Haitao.Wu (HTNecro@gmail.com)
 */
fun main(args: Array<String>) {
    launch {
        // launch new coroutine in background and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello,") // main thread continues while coroutine is delayed
    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
}