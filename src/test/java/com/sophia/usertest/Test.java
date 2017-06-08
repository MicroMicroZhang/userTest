package com.sophia.usertest;

import java.util.regex.Pattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		
		  Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
		  
	        System.out.println(f1 == f2);
	        System.out.println(f3 == f4);
		
		/*short s1 = 1; 
		s1 = (short) (s1 + 1);*/
		
		/*System.out.println("abc".matches("..."));
		System.out.println("abc123456789abc".replaceAll("\\d", "-"));
		Pattern p = Pattern.compile("[a-z]{3}");
		System.out.println(p.matcher("avx").matches());*/
	/*	ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Boss boss = (Boss) ac.getBean("boss");
        System.out.println(boss);*/
	}
}
