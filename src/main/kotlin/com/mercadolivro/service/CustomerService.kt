package com.mercadolivro.service

import com.mercadolivro.controller.request.PostCostumerRequest
import com.mercadolivro.controller.request.PutCostumerRequest
import com.mercadolivro.model.CustomerModel
import org.springframework.stereotype.Service


@Service
class CustomerService {

    val customers = mutableListOf<CustomerModel>()


    fun getAll(name: String?): List<CustomerModel> {
        name?.let {
            return customers.filter { it.name.contains(name, ignoreCase = true) }
        }
        return customers
    }

    fun create(customer: PostCostumerRequest){

        val id = if(customers.isEmpty()){
            "1"
        } else {
            customers.last().id.toInt() + 1
        }.toString()

        customers.add(CustomerModel(id, customer.name, customer.email))
    }

    fun getCostumer(id: String): CustomerModel {
        return customers.filter { it.id == id }.first()
    }

     fun update(id: String, customer: PutCostumerRequest) {
        customers.filter { it.id == id }.first().let {
            it.name = customer.name
            it.email = customer.email
        }
    }

    fun delete(id: String) {
        customers.removeIf {it.id == id}
    }

}