package com.stores.retailstore.controller;

import com.stores.retailstore.controller.requests.DiscountRequest;
import com.stores.retailstore.services.DiscountService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/v1/discounts")
public class DiscountController {

    @Autowired
    private DiscountService discountService;

    @PostMapping
    public BigDecimal createDiscount(@Valid @RequestBody DiscountRequest request) {
        return discountService.calculateDiscount(request.getUser(), request.getBill());
    }

}
