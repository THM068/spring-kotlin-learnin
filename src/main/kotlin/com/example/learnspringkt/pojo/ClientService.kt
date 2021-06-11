package com.example.learnspringkt.pojo

class ClientService private constructor() {
    val name = "Thomas"
    val surname = "Mafela"
    companion object {
        private val clientService = ClientService()
        fun createInstance() = clientService
    }
}