package com.demo.spring;
import org.springframework.stereotype.Component;
@Component
public class SetterDependency {
public SetterDependency() {
System.out.println("Setter dependency initialized");
}
@Override
public String toString() {
return "SetterDependency []";
}
}