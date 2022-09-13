package com.imason.ddd.handler

import com.imason.ddd.domain.entity.dto.OrderSubmitDto

abstract class AbstractSubmitOrderHandler {

    protected var nextHandler: AbstractSubmitOrderHandler? = null

    abstract fun doHandler(orderSubmitDto: OrderSubmitDto)

    fun next(nextHandler: AbstractSubmitOrderHandler) {
        this.nextHandler = nextHandler
    }

    companion object Builder {
        private var head: AbstractSubmitOrderHandler? = null
        private var tail: AbstractSubmitOrderHandler? = null

        fun addHandler(handler: AbstractSubmitOrderHandler): Builder {
            if (this.head == null) {
                this.head = handler
                this.tail = handler
            } else {
                this.tail?.next(handler)
                this.tail = handler
            }
            return this
        }

        fun build(): AbstractSubmitOrderHandler? {
            return this.head
        }
    }
}