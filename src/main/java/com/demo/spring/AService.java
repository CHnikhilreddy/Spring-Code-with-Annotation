package com.demo.spring;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AService {
	private ConstructorDependency constructorDependency;
	private SetterDependency setterDependency;
	@Autowired
	public AService(ConstructorDependency constructorDependency) {
		this.constructorDependency = constructorDependency;
	}
	@Autowired
	public void setSetterDependency(SetterDependency setterDependency) {
		this.setterDependency = setterDependency;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Bean initializing after wiring all dependencies");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Pre destroy");
	}
	@Override
	public String toString() {
		return "AService [constructorDependency=" + constructorDependency + ",setterDependency=" + setterDependency+ "]";
		}
}
