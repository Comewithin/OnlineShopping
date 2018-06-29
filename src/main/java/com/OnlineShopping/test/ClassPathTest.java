package com.OnlineShopping.test;

import org.junit.runner.RunWith;


import org.junit.Test;//手动添加
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;//手动添加


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class ClassPathTest {

	@Test
	public void Test(){
		//读取classPath下的spring.xml配置文件
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-mybatis.xml"); 
		System.out.println("success:"+ctx);
		
	}
}
