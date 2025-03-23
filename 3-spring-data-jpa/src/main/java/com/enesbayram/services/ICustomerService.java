package com.enesbayram.services;

import com.enesbayram.dto.DtoCustomer;

public interface ICustomerService {

	public DtoCustomer findCustomerById(Long id);
}
