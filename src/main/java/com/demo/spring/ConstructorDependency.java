package com.demo.spring;
import org.springframework.stereotype.Component;@Component
public class ConstructorDependency {
public ConstructorDependency( ) {
System.out.println("Constructor depency initialized");
}
@Override
public String toString() {
return "ConstructorDependency []";
}
}