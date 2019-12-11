package com.spring.basics.springbasics.basic;

import com.spring.basics.springbasics.basic.SortAlgorithm;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){

        return numbers;
    }

}
