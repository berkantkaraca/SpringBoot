package com.enesbayram.controller;

import java.util.List;

import com.enesbayram.dto.DtoStudent;
import com.enesbayram.dto.DtoStudentIU;

public interface IStudentController {

	public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id , DtoStudentIU dtoStudentIU);
	
}
