package com.dingya.thread;
/** 
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P2 {
	/*
	 * 测试方法
	 */
	public static void main(String[] args) {
		EventStorage storage = new EventStorage();
		Producer producer = new Producer(storage);
		Consumer consumer = new Consumer(storage);
		
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}
