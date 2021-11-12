package com.example.myproject;

public class BinarySearchImpl {
    //sort
    //search
    public int binarySearch(int[] numbers, int left, int right, int numberToSearchFor) {
        if (right >= left) {
            int middle = ((right - 1) + left) / 2;
            if (middle == numberToSearchFor)
                return middle;
            if (numbers[middle] > numberToSearchFor)
                return binarySearch(numbers, left, middle - 1, numberToSearchFor);

            return binarySearch(numbers, middle + 1, right, numberToSearchFor);
        }
        return -1;

    }

}
