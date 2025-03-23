package com.enesbayram.controller;

import com.enesbayram.dto.DtoCustomer;

public interface ICustomerController {

	public DtoCustomer findCustomerById(Long id);
}
