package com.mercadolivro.extension

import com.mercadolivro.controller.request.PostCostumerRequest
import com.mercadolivro.controller.request.PutCostumerRequest
import com.mercadolivro.model.CustomerModel

fun PostCostumerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name= this.name, email = this.email)
}

fun PutCostumerRequest.toCustomerModel(id : String): CustomerModel {
    return CustomerModel(id = id, name= this.name, email = this.email)
}

