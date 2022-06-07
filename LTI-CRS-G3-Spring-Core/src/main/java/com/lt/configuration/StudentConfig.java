/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lt.service.StudentService;
import com.lt.service.StudentServiceInterface;

/**
 * @author 91988
 *
 */
//Note: this is a configuration class which is representing @Configuration.
//@Bean annotation which is applied on method to specify that is return a bean to be managed by springcontext.
@Configuration
public class StudentConfig {

	@Bean(name = "studentBean")
	public StudentServiceInterface studentService() {
		return new StudentService();
	}

}
