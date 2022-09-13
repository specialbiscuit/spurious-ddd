package com.imason.ddd.controller

import com.imason.ddd.domain.entity.dto.OrderDto
import com.imason.ddd.domain.entity.dto.OrderSubmitDto
import com.imason.ddd.service.IOrderService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource

@RestController
class OrderController {
    @Resource
    private lateinit var orderService: IOrderService

    /**
     * 责任链校验器
     * 提交订单
     * 价格计算（运费+税费等） -> 条件校验器 -> 提交订单(生成订单)
     */
    @PostMapping("/order/submit")
    fun submit(orderSubmitDto: OrderSubmitDto) {
        orderService.submit(orderSubmitDto)
    }
}