package com.spring.basics.springbasics;

import com.spring.basics.springbasics.basic.BinarySearchImpl;
import com.spring.basics.springbasics.properties.SomeExternalService;
import com.spring.basics.springbasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.*;


@Configuration
@ComponentScan
//Configuartion app.properties, read properties from this sepicific app.properties file
@PropertySource("classpath:app.properties")

public class SpringBasicPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicPropertiesApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBasicPropertiesApplication.class);

		SomeExternalService someExternalService =  context.getBean(SomeExternalService.class);
		LOGGER.info("{} " , someExternalService.returnServiceURL());


	}

}
