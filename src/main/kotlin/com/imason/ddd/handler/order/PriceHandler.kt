package com.imason.ddd.handler.order

import com.imason.ddd.domain.entity.dto.OrderSubmitDto
import com.imason.ddd.handler.AbstractSubmitOrderHandler

class PriceHandler: AbstractSubmitOrderHandler() {

    override fun doHandler(orderSubmitDto: OrderSubmitDto) {
        // TODO("Not yet implemented")
        System.out.println("价格计算OK")

        if(nextHandler != null){
            return nextHandler!!.doHandler(orderSubmitDto);
        }
    }
}