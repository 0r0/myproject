package com.example.myproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        return  numbers;
    }

}
