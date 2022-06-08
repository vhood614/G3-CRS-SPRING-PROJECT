/**
 * 
 */
package com.lt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lt.entity.Admin;

/**
 * @author 91988
 *
 */

@Repository
public interface AdminRepository  extends CrudRepository<Admin, Integer>{

}
