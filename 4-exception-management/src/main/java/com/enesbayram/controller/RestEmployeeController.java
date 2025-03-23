package com.enesbayram.controller;

import com.enesbayram.dto.DtoEmployee;
import com.enesbayram.model.RootEntity;

public interface RestEmployeeController {

	public RootEntity<DtoEmployee> findEmployeeById(Long id);
}
