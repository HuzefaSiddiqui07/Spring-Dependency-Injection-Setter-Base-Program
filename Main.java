package com.springframework.applicationcontext.settertype2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationcontext.xml");

		Candidate candidate = (Candidate) applicationContext.getBean("Siddiqui");

		candidate.getMessage("Huzefa Muzammil Siddiqui-");

	}

}
