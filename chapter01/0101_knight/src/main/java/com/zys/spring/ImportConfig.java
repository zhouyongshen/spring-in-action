package com.zys.spring;

import com.zys.spring.aop.AOPConfig;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Import({DiConfig.class, AOPConfig.class})
@EnableAspectJAutoProxy
public class ImportConfig {
}
