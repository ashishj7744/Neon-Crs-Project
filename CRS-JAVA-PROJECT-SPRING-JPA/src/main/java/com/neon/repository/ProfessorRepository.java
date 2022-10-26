/**
 * 
 */
package com.neon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.neon.entity.Professor;

/**
 * @author user363
 *
 */
@Repository
public interface ProfessorRepository extends CrudRepository<Professor,Integer> {

}
