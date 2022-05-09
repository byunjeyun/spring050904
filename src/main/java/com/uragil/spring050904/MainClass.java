package com.uragil.spring050904;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX.xml", "classpath:applicationCTX2.xml");
		
		Student stu1 = ctx.getBean("student1",Student.class);
		System.out.println(stu1.getName());
		
		
		StudentInfo stuInfo = ctx.getBean("studentInfo1", StudentInfo.class);
		Student stu00 = stuInfo.getStudent();
		
		System.out.println(stu00.getName());
		ctx.close();
			
		if(stu1.equals(stu00)) {
			System.out.println("stu1과 stu00객체는 같은 객체입니다.");
		}
		
		Student stu2 = ctx.getBean("student2", Student.class);
		System.out.println(stu2.getName());
	
		Family gildong = ctx.getBean("family", Family.class);
		System.out.println(gildong.getFather());
		System.out.println(gildong.getBrother());
		
		ctx.close();
	}

}
