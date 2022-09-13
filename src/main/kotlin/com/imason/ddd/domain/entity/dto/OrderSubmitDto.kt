package com.imason.ddd.domain.entity.dto

import lombok.Data

@Data
class OrderSubmitDto {
    var addressDto: AddressDto? = null
    var goodsDto: GoodsDto? = null
    var couponDto: CouponDto? = null
}