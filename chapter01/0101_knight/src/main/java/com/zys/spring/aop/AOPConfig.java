package com.zys.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AOPConfig {

    private Minstrel minstrel;

    public AOPConfig(Minstrel minstrel) {
        this.minstrel = minstrel;
    }

    @Pointcut("execution(* com.zys.spring.di..*(..))")
    public void aspect(){}

    @Before("aspect()")
    public void before(JoinPoint joinPoint){
        minstrel.before();
    }
    @After("aspect()")
    public void after(JoinPoint joinPoint){
        minstrel.before();

    }

}
