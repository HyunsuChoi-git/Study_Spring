package com.heracomp.Study_Spring.service;


import com.heracomp.Study_Spring.logic.Sort;

import java.util.List;

public class SortService {
    
    private final Sort<String> sort;

    public SortService(Sort<String> sort){
        this.sort = sort;
        System.out.println("구현체는 : "+ sort.getClass().getName());
    }

    public List<String> doSort(List<String> list){
        return sort.sort(list);
    }
}