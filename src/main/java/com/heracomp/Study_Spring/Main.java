package com.heracomp.Study_Spring;


import com.heracomp.Study_Spring.config.Config;
import com.heracomp.Study_Spring.logic.BubbleSort;
import com.heracomp.Study_Spring.logic.Sort;
import com.heracomp.Study_Spring.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService service = context.getBean(SortService.class);

        System.out.println("[result] "+service.doSort(Arrays.asList(args)));

    }
}
