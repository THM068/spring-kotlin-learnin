package com.example.learnspringkt.config

import com.example.learnspringkt.pojo.Animal
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AnimalConfiguration {

    @Bean
    fun panda() = Animal(name = "Panda")
}