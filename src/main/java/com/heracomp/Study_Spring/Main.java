package com.heracomp.Study_Spring;


import com.heracomp.Study_Spring.logic.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort<String> sort = new BubbleSort<>();

        System.out.println("[result] "+sort.sort(Arrays.asList(args)));

    }
}
