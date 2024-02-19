package com.stores.retailstore.models;

import java.util.List;

import lombok.Data;


@Data
public class Bill {

    private List<Item> items;

}
