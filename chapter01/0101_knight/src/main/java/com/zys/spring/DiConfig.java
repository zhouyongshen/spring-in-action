package com.zys.spring;

import com.zys.spring.aop.Minstrel;
import com.zys.spring.di.*;
import com.zys.spring.main.di.*;
import org.springframework.context.annotation.Bean;

public class DiConfig {

    @Bean
    Quest quest(){
        return new SplayDragQuest(System.out);
    }

    @Bean
    Knights knights(){
        return new BraveKnights(quest());
    }

    @Bean
    Minstrel Minstrel(){
        return new Minstrel(System.out);
    }


    @Bean
    ABean aBean(){return new ABean();}

}
