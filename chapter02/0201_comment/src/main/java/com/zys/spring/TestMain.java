package com.zys.spring;

import com.zys.spring.di.ABean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
public class TestMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestMain.class);
        System.out.println("#############################################");
        ABean bean = ctx.getBean(ABean.class);
        System.out.println(bean);

    }
}
