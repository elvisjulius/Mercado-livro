package com.mercadolivro.controller

import com.mercadolivro.controller.request.PostCostumerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.expression.spel.ast.Elvis
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomers(): CustomerModel{
        return CustomerModel("1", "Elvis","elvisjulius@hotmail.com")
    }

    @PostMapping
    fun create(@RequestBody customer: PostCostumerRequest){
        println(customer)
    }
}