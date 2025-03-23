package com.enesbayram.service;

import com.enesbayram.dto.DtoEmployee;

public interface IEmployeeService {

	public DtoEmployee findEmployeeById(Long id);
}
