package com.hbsi.test;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;


public class TestActive {
	/**
	 * 测试生产者
	 */
	@Test
	public void demoProduce(){
		//初始化容器
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//从容器得到jmsTemplate对象
		JmsTemplate jmsTemplate = context.getBean(JmsTemplate.class);
		//从容器获得Destination对象    topicDestination   queueDestination
		Destination destination = (Destination) context.getBean("topicDestination");
		//发送消息 ,参数2是一个创建消息的接口
		jmsTemplate.send(destination, new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				//创建消息
				TextMessage textMessage = session.createTextMessage();
				textMessage.setText("你好啊，我是生产消息者3，很高兴认识你" );
				return textMessage;
			}
		});
	}
	
}
