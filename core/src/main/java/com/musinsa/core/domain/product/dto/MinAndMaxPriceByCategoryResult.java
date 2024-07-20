package com.musinsa.core.domain.product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MinAndMaxPriceByCategoryResult {
    private MinAndMaxPriceProductByCategory minPrice;

    private MinAndMaxPriceProductByCategory maxPrice;

}
