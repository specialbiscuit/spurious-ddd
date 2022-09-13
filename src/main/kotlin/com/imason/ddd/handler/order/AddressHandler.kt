package com.imason.ddd.handler.order

import com.imason.ddd.domain.entity.dto.OrderSubmitDto
import com.imason.ddd.handler.AbstractSubmitOrderHandler
import lombok.extern.slf4j.Slf4j
import java.lang.Exception
import kotlin.math.log

@Slf4j
class AddressHandler: AbstractSubmitOrderHandler() {

    override fun doHandler(orderSubmitDto: OrderSubmitDto) {
        // TODO("Not yet implemented")

        throw Exception("地址校验失败")
        System.out.println("地址校验OK")

        if(nextHandler != null){
            return nextHandler!!.doHandler(orderSubmitDto)
        }

    }
}