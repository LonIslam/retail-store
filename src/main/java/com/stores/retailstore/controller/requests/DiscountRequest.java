package com.stores.retailstore.controller.requests;


import com.stores.retailstore.models.Bill;
import com.stores.retailstore.models.User;

import lombok.Data;


@Data
public class DiscountRequest {

    private User user;

    private Bill bill;

}
