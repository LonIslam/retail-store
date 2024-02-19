package com.stores.retailstore.models;


import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Item {

    private ItemType type;

    private BigDecimal price;
}
