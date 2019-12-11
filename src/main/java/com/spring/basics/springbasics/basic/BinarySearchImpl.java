package com.spring.basics.springbasics.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")//creates different instance of bean every time you make a request
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    //***Constructor Injection -- used for mandatory dependency
    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }*/


    //***Setter Injection
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    //Approach-1
    /*@Autowired
    private BubbleSortAlgorithm bubbleSortAlgorithm;

    public int binarySearchforBubleSortAlgorithm(int[] numbers, int numberToSearch){

        int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
        System.out.println(bubbleSortAlgorithm);
        //Search the array
        //Return the result
        return 3;

    }*/

    public int binarySearch(int[] numbers, int numberToSearch){

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        //Search the array
        //Return the result
        return 3;

    }

}
