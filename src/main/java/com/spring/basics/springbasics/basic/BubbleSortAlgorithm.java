package com.spring.basics.springbasics.basic;

import com.spring.basics.springbasics.basic.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
//@Primary//priority (importance)
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers){

        return numbers;
    }

}
