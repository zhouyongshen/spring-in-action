package com.zys.spring.aop;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void before(){
        //探险之前调用
        stream.println("before");
    }
    public void after(){
        //探险之后调用
        stream.println("after");
    }
}
