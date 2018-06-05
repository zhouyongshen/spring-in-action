package com.zys.spring.di;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ABean.class)
public class ABeanTest {

    @Autowired
    private ABean aBean;

    @Test
    public void test(){
        System.out.println(aBean);
    }
}