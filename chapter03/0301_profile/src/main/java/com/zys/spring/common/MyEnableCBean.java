package com.zys.spring.common;

import com.zys.spring.enable.MyConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MyConfig.class)
public @interface MyEnableCBean {
}
