package com.example.myproject.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class BinarySearchImpl {
    private Logger logger= LoggerFactory.getLogger(this.getClass());
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }



    public int binarySearch(int[] numbers, int numberToSearchFor) {

        int[] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    //sort
    //search
//    public int binarySearch(int[] numbers, int left, int right, int numberToSearchFor) {
//        if (right >= left) {
//            int middle = ((right - 1) + left) / 2;
//            if (middle == numberToSearchFor)
//                return middle;
//            if (numbers[middle] > numberToSearchFor)
//                return binarySearch(numbers, left, middle - 1, numberToSearchFor);
//
//            return binarySearch(numbers, middle + 1, right, numberToSearchFor);
//        }
//        return -1;
//
//    }
//    private int[] sortedArray(int[] numbers) {
//        return null;
//
//    }


    }



//    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//        this.sortAlgorithm = sortAlgorithm;
//    }
}
