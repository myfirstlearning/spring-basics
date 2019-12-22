package com.spring.basics.springbasics;

import com.spring.basics.springbasics.basic.BinarySearchImpl;
import com.spring.basics.springbasics.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringBasicsApplication {

	//what are beans?
	//what are the dependencies of a bean?
	//where to search for the beans?

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicsApplication.class);

	public static void main(String[] args) {

		/*BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[]{12,4,5,6,3,2},3);
		System.out.println("Binary search result :" + result);*/

		//Application Context manages all the beans
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
		//ApplicationContext context = SpringApplication.run(SpringBasicsApplication.class, args);

		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		System.out.println("!!!BinarySearch bean ==> " + binarySearch);
		BinarySearchImpl binarySearch1 = context.getBean(BinarySearchImpl.class);
		System.out.println("!!!BinarySearch bean ==> " + binarySearch1);

		int result = binarySearch.binarySearch(new int[]{12,4,5,6,3,2},3);
        System.out.println("!!!Binary Search Result :" + result);

        //Prototype
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		LOGGER.info("{}" + personDAO);
		LOGGER.info("{}" + personDAO.getJdbcConnection());

		PersonDAO personDAO1 = context.getBean(PersonDAO.class);
		LOGGER.info("{}" + personDAO1);
		LOGGER.info("{}" + personDAO1.getJdbcConnection());

		// close AnnotationConfigApplicationContext
		context.close();


	}

}
