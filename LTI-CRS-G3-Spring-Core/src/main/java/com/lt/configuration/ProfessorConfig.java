/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.AdminService;
import com.lt.service.AdminServiceInterface;
import com.lt.service.ProfessorService;
import com.lt.service.ProfessorServiceInterface;

/**
 * @author 91988
 *
 */
//Note: this is a configuration class which is representing @Configuration.
//@Bean annotation which is applied on method to specify that is return a bean to be managed by springcontext.
@Configuration
public class ProfessorConfig {
	@Bean(name = "professorBean")
	public ProfessorServiceInterface professorService() {
		return new ProfessorService();
	}

}
