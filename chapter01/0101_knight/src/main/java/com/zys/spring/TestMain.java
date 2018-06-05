package com.zys.spring;

import com.zys.spring.di.Knights;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ImportConfig.class);
        System.out.println("#############################################");
        Knights knights = context.getBean(Knights.class);
        knights.embarkOnQuest();

    }
}
