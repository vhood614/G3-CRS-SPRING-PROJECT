/**
 * 
 */
package com.lt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lt.entity.Course;
import com.lt.entity.Professor;

/**
 * @author 91988
 *
 */

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer>{

}
