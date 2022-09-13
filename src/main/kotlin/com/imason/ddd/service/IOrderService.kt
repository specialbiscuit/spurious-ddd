package com.imason.ddd.service

import com.imason.ddd.domain.entity.dto.OrderDto
import com.imason.ddd.domain.entity.dto.OrderSubmitDto
import org.springframework.stereotype.Service

interface IOrderService {
    fun submit(orderSubmitDto: OrderSubmitDto)
}