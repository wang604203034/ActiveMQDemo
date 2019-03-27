package com.hbsi.demo;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class CustomerMessage implements MessageListener{
	/**
	 * 消费者
	 */
	public void onMessage(Message msg) {
		try {
			//TextMessage继承Message
			TextMessage textMessage = (TextMessage) msg;
			//接收消息
			String text = textMessage.getText();
			System.out.println("消费者监听到的消息 : "+text);
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
