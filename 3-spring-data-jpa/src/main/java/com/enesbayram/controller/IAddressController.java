package com.enesbayram.controller;

import com.enesbayram.dto.DtoAddress;

public interface IAddressController {

	public DtoAddress findAddressById(Long id);
}
