package com.enesbayram.controller;

import com.enesbayram.dto.DtoHome;

public interface IHomeController {

	public DtoHome findHomeById(Long id);
}
