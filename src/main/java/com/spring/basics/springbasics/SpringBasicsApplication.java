package com.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBasicsApplication {

	//what are beans?
	//what are the dependencies of a bean?
	//where to search for the beans?


	public static void main(String[] args) {

		/*BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearch.binarySearch(new int[]{12,4,5,6,3,2},3);
		System.out.println("Binary search result :" + result);*/
		//com.spring.basics.springbasics.BubbleSortAlgorithm@5a10411
		//com.spring.basics.springbasics.QuickSortAlgorithm@5a10411

		//Application Context manages all the beans
		ApplicationContext context = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12,4,5,6,3,2},3);




	}

}
