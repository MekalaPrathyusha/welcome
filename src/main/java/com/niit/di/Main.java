package com.niit.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
	public static void main(String[] args){
		ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
	}

}
