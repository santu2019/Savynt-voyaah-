package com.Saviynt.Utilities;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryTransform implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation, 
			Class testClass, Constructor testConstructor, Method testMethod) 
	{
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}
}
