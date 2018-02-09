package com.shopify.api.adapter

import com.client.shop.getaway.entity.State
import com.shopify.api.entity.ApiState

object StateAdapter {

    fun adapt(data: ApiState): State {
        return State(
            id = data.id,
            countryId = data.countryId,
            name = data.name,
            code = data.code
        )
    }
}