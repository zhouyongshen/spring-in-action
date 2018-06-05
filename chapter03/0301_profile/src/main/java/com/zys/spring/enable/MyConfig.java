package com.zys.spring.enable;


import com.zys.spring.main.di.CBean;
import org.springframework.context.annotation.Bean;

public class MyConfig {

    @Bean
    public CBean cBean(){
        return new CBean();
    }
}
