package com.enesbayram.services;

import com.enesbayram.dto.DtoAddress;

public interface IAddressService {

	public DtoAddress findAddressById(Long id);
}
