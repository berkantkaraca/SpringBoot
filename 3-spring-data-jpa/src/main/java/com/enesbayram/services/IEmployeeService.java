package com.enesbayram.services;

import java.util.List;

import com.enesbayram.dto.DtoEmployee;

public interface IEmployeeService {

	public List<DtoEmployee> findAllEmployees();
}
