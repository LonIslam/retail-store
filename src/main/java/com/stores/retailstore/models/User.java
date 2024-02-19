package com.stores.retailstore.models;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

	private UserType type;

	private LocalDate registerDate;
}
