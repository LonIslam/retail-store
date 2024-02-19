package com.stores.retailstore.services;

import com.stores.retailstore.models.Bill;
import com.stores.retailstore.models.User;

import java.math.BigDecimal;

/**
 * This is the Discount interface
 */
public interface DiscountService {

    /**
     * This method calculate discount for given user and bill
     * @param user  - User
     * @param bill - Bill
     * @return Double - payable amount for the user
     */
    BigDecimal calculateDiscount(User user, Bill bill);
}
