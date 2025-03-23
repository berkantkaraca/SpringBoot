package com.enesbayram.controller;

import java.util.List;

import com.enesbayram.dto.DtoEmployee;

public interface IEmployeeController {

	public List<DtoEmployee> findAllEmployees();
}
