package com.enesbayram.services;

import java.util.List;

import com.enesbayram.dto.DtoStudent;
import com.enesbayram.dto.DtoStudentIU;
import com.enesbayram.entites.Student;

public interface IStudentService {

	public DtoStudent saveStudent(DtoStudentIU student);
	
	public List<DtoStudent> getAllStudents();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id , DtoStudentIU dtoStudentIU);
	
}
