package com.spring.basics.springbasics;

import com.spring.basics.springbasics.XMLScope.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringBasicApplicationContextApplication {

	//what are beans?
	//what are the dependencies of a bean?
	//where to search for the beans?

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicApplicationContextApplication.class);

	public static void main(String[] args) {

		//AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicApplicationContextApplication.class);

		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){

			//verifies what are the beans loaded by the applicationContext
			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

			XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);
			LOGGER.info("{} {}", xmlPersonDAO, xmlPersonDAO.getXmljdbcConnection());

		}

	}

}
