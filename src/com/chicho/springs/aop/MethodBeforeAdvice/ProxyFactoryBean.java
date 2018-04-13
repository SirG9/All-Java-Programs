package com.chicho.springs.aop.MethodBeforeAdvice;

import java.util.List;

public class ProxyFactoryBean {
	private Object target;
	private List interceptorNames;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public List getInterceptorNames() {
		return interceptorNames;
	}

	public void setInterceptorNames(List interceptorNames) {
		this.interceptorNames = interceptorNames;
	}
}

/*
 * The ProxyFactoryBean class is provided by Spring Famework. It contains 2
 * properties, target and interceptorNames. The instance of A class will be
 * considered as target object (A class Obj) and the instance of advisor
 * class (BeforeAdvisor class) as interceptor. You need to pass the advisor
 * object as the list object as in the xml file given above.
 */