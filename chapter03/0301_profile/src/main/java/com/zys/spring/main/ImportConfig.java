package com.zys.spring.main;

import com.zys.spring.conditional.DBean;
import com.zys.spring.conditional.MyCondition;
import com.zys.spring.main.di.ABean;
import com.zys.spring.main.di.BBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ImportConfig {

    @Bean
    public ABean abean(){
        return new ABean();
    }

    @Bean
    @Profile("test")
    public BBean bBean(){
        return new BBean();
    }

    @Bean
    @Conditional(MyCondition.class)
    public DBean dBean(){
        return new DBean();
    }


}
