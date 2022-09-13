package com.imason.ddd.service.impl

import com.imason.ddd.domain.OrderDomain
import com.imason.ddd.domain.entity.dto.OrderSubmitDto
import com.imason.ddd.mapper.OrderMapper
import com.imason.ddd.service.IOrderService
import org.springframework.stereotype.Service
import javax.annotation.Resource

@Service
class OrderService: IOrderService{
    @Resource
    private lateinit var orderDomain: OrderDomain
    @Resource
    private lateinit var orderMapper: OrderMapper

    override fun submit(orderSubmitDto: OrderSubmitDto) {
        // 校验责任链 地址校验 商品校验 价格校验 优惠券校验

        orderDomain.submit(orderSubmitDto)
    }
}