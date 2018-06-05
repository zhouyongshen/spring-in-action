package com.zys.spring.di;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * java bean 声明周期演示
 */
@Component
public class ABean implements BeanNameAware,BeanFactoryAware,ApplicationContextAware,BeanPostProcessor,InitializingBean,DisposableBean {


    static int num=0;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println((++num)+"   setBeanFactory()");
    }

    public void setBeanName(String s) {
        System.out.println((++num)+"   setBeanName()");
    }

    public void destroy() throws Exception {
        System.out.println((++num)+"   destroy()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println((++num)+"   afterPropertiesSet()");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println((++num)+"   setApplicationContext()");
    }
}
