package com.zys.spring.main;

import com.zys.spring.common.MyEnableCBean;
import com.zys.spring.conditional.DBean;
import com.zys.spring.main.di.ABean;
import com.zys.spring.main.di.BBean;
import com.zys.spring.main.di.CBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan
@MyEnableCBean
public class TestMain {

    public static void main(String[] args) {
        System.setProperty("spring.profiles.active","test");
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TestMain.class);
        System.out.println("#############################################");
        ABean aBean = ctx.getBean(ABean.class);
        System.out.println(aBean);
        BBean bBean = ctx.getBean(BBean.class);
        System.out.println(bBean);

        CBean cBean = ctx.getBean(CBean.class);
        System.out.println(cBean);
        DBean dBean = ctx.getBean(DBean.class);
        System.out.println(dBean);
    }
}
