package com.neon.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neon.entity.Professor;
import com.neon.service.ProfessorService;

@RestController
public class ProfessorController {
	
	

	@Autowired    
	private ProfessorService professorService;
	
	@RequestMapping("/get-user")  
	@Transactional
	
	public List<Professor> getAllProfessor()  
	{    
	return professorService.getAllProfessor();
	}  
	
	
	@RequestMapping("/add-user")  
	@Transactional
	public List<Professor> addUser(@RequestBody Professor professor)  
	{    
		professorService.addUser(professor);  
		return professorService.getAllProfessor();
	}    

}
