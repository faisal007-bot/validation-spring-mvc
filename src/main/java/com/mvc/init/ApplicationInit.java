package com.mvc.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.mvc.config.ApplicationConfig;

@Component
public class ApplicationInit implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context = 
				new AnnotationConfigWebApplicationContext();
		context.register(ApplicationConfig.class);
		ServletRegistration.Dynamic reg = 
				servletContext.addServlet("mvc", new DispatcherServlet(context));
		reg.setLoadOnStartup(1);
		reg.addMapping("/");
	}

}
