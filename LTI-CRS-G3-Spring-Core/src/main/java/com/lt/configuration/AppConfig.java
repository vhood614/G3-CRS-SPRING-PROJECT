/**
 * 
 */
package com.lt.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 91988
 *
 */
//Note: this is a configuration class which is representing @Configuration.
//@Bean annotation which is applied on method to specify that is return a bean to be managed by springcontext.
@Configuration
@Import({ AdminConfig.class, StudentConfig.class, ProfessorConfig.class, UserConfig.class })
public class AppConfig {

}