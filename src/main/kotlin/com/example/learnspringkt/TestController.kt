package com.example.learnspringkt

import com.example.learnspringkt.pojo.Person
import com.example.learnspringkt.pojo.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class TestController(val person: Person) {
    @Autowired
    lateinit var products: Map<String, Product>
//    lateinit var products: List<Product>

    @GetMapping
    fun name(): ResponseEntity<String> {
//        products.forEach { println("id --> ${it.id} and name --> ${it.name}")}
        products.entries.forEach { println("${it.key} ---> ${it.value}") }
        return ResponseEntity("Hello world ${person.name} and ${person.lastName}", HttpStatus.OK)
    }
}