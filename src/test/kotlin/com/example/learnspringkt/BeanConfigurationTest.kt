package com.example.learnspringkt

import com.example.learnspringkt.config.BeanConfiguration
import com.example.learnspringkt.config.ConfigMerge
import com.example.learnspringkt.pojo.Animal
import com.example.learnspringkt.pojo.Product
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension


@ExtendWith(SpringExtension::class)
@ContextConfiguration(classes = [ConfigMerge::class])
class BeanConfigurationTest {

    @Autowired
    lateinit var context: ApplicationContext

    @Test
    fun `check bean exists`() {
        assertThatBeanExists("Bike", Product::class.java)
        assertThatBeanExists("Car", Product::class.java)
        assertThatBeanExists("Plane", Product::class.java)
        assertThatBeanExists("Plane", Product::class.java)
        assertThatBeanExists("panda", Animal::class.java)
    }

    private fun assertThatBeanExists(beanName: String, beanClass: Class<*>) {
        assertTrue(context.containsBean(beanName))
        assertNotNull(context.getBean(beanName, beanClass))
    }

}