package com.example.learnspringkt.config

import com.example.learnspringkt.pojo.ClientService
import com.example.learnspringkt.pojo.Person
import com.example.learnspringkt.pojo.Product
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
class BeanConfiguration {

    @Bean
    fun person() = Person()

    @Bean(name = ["Bike"])
    fun product1() = Product(1L, "Bike")

    @Bean(name = ["Car"])
    fun product2() = Product(2L, "Car")

    @Bean(name = ["Plane"])
    fun product3() = Product(3L, "Plane")

    @Bean
    fun clientService() = ClientService.createInstance()
}