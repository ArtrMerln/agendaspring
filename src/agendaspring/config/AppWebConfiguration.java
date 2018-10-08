package agendaspring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import agendaspring.controllers.Homecontroller;

@EnableWebMvc
@ComponentScan(basePackageClasses = {Homecontroller.class})
public class AppWebConfiguration {

	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {
 InternalResourceViewResolver resolver = new InternalResourceViewResolver();
 
resolver.setPrefix("/WEB-INF/views/");
	
	return resolver;
	}
	
}