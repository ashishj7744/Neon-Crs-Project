/**
 * 
 */
package com.neon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neon.entity.Professor;
import com.neon.repository.ProfessorRepository;

/**
 * @author user363
 *
 */
@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professorRepository;

	public List<Professor> getAllProfessor() {
		// TODO Auto-generated method stub
		List<Professor> professor = new ArrayList<>();    
		professorRepository.findAll().forEach(professor::add);    
		return professor;   
	}

	public void addUser(Professor professor) {
		// TODO Auto-generated method stub
		professorRepository.save(professor);
	}
	
	

}
