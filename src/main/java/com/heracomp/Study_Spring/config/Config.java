package com.heracomp.Study_Spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.heracomp.Study_Spring")  // ("")안을 Root로 잡고 그 안의 spring bean들을 스캔할 것임
@Configuration //spring전용 컨피규레이션
public class Config {

}
