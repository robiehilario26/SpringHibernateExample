package com.websystique.springmvc.configuration;
 
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/* The content below resembles the content of web.xml as we are using the front-controller DispatherServler, 
 * assigning the mapping (url-pattern in xml) and instead of providing the path to spring configuration file(spring-servlet.xml) ,
 * here we are registering the Configuration Class.*/

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
	}

}