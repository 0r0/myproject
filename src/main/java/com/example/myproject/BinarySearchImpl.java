package com.example.myproject;

import org.springframework.stereotype.Service;

@Service
public class BinarySearchImpl {
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

    public int binarySearch(int[] numbers,int numberToSearchFor){

        BubbleSortAlgorithm bubbleSortAlgorithm= new BubbleSortAlgorithm();
        bubbleSortAlgorithm.sort(numbers);
        return 3;
    }
}
