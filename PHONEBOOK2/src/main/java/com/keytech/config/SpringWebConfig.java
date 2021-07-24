package com.keytech.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages= {"com.keytech"})
@EnableWebMvc
public class SpringWebConfig extends WebMvcConfigurationSupport{

	@Override
	protected void addResourceHandlers(ResourceHandlerRegistry registry) {
		
	}
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver iResolver = new InternalResourceViewResolver();
		//iResolver.setViewClass(JstlView.class);
		iResolver.setPrefix("/WEB-INF/view/");
		iResolver.setSuffix(".jsp");
		
		return iResolver;
	}
	
}
