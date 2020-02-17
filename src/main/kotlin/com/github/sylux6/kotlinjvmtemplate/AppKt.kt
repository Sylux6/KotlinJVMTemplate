package com.github.sylux6.kotlinjvmtemplate

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

object AppKt {
    @JvmStatic
    fun main(args: Array<String>) {
        logger.info("Main function")
        println("Hello world")
    }
}
