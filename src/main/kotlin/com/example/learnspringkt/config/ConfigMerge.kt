package com.example.learnspringkt.config

import org.springframework.context.annotation.Import

@Import(value = [AnimalConfiguration::class, BeanConfiguration::class])
class ConfigMerge {
}