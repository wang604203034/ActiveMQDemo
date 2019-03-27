package com.hbsi.test;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCustomerMessage {
	
	/**
	 * 接收监听到的消息
	 * @throws IOException 
	 */
	@SuppressWarnings("resource")
	@Test
	public void customerMessage() throws IOException{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		System.in.read();
	}
}
