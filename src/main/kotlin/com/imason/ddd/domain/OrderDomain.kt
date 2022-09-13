package com.imason.ddd.domain

import com.imason.ddd.domain.entity.dto.OrderSubmitDto
import com.imason.ddd.handler.AbstractSubmitOrderHandler
import com.imason.ddd.handler.order.AddressHandler
import com.imason.ddd.handler.order.PriceHandler
import org.springframework.stereotype.Component

@Component
class OrderDomain {

    /**
     * 提交订单
     */
    fun submit(orderSubmitDto: OrderSubmitDto): String {
        // 校验逻辑
        val builder = AbstractSubmitOrderHandler.Builder
        builder
            .addHandler(PriceHandler())
            .addHandler(AddressHandler())
            .build()
            ?.doHandler(orderSubmitDto)

        return "SN20220913123123123123";
    }

    /**
     * 取消订单
     */
    fun cancel() {}



}