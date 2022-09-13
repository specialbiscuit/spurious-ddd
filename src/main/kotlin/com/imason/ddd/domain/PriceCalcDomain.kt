package com.imason.ddd.domain

import org.springframework.stereotype.Component

@Component
class PriceCalcDomain {

    /**
     * 价格计算
     */
    fun calc(): Double {
        return 0.00;
    }
}