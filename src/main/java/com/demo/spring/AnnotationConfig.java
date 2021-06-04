package com.demo.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
@ComponentScan(basePackages = "com.demo.spring")
public class AnnotationConfig {
@Bean@Scope("prototype")
public PrototypeBean getPrototypeBean() {
return new PrototypeBean();
}
@Bean
public SingletonScopeBean getSingletonScopeBean() {
return new SingletonScopeBean();
}
}