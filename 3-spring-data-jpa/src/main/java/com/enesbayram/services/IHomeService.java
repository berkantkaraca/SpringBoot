package com.enesbayram.services;

import com.enesbayram.dto.DtoHome;

public interface IHomeService {

	public DtoHome findHomeById(Long id);
}
