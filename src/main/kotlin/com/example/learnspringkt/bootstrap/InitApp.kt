package com.example.learnspringkt.bootstrap

import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import org.springframework.boot.CommandLineRunner as BootCommandLineRunner

@Component
class InitApp(val applicationContext: ApplicationContext) : BootCommandLineRunner {

    override fun run(vararg args: String?) {
        println("I am starting app ....")
        applicationContext.beanDefinitionNames.forEach {
            println(it)
        }
    }
}