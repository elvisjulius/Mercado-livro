package com.mercadolivro.controller.request

import com.mercadolivro.model.CustomerModel

data class PutCostumerRequest (
    var name : String,
    var email : String
) {

    fun toCostumerModel(): CustomerModel {
        return CustomerModel(name =  this.name, email = this.email)

    }
}


