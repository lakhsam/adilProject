package org.koushik.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Traingle tr= new Traingle();
		//BeanFactory factory =new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle tr = (Triangle) factory.getBean("triangle");
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle tr = (Triangle) context.getBean("triangle");
		
		tr.draw();
		
	     /* HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

	      objA.setMessage("I'm object A");
	      objA.getMessage();

	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.getMessage();*/


	}

}
