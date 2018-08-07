package com.dingya.thread;
/** 
 * 2. 使用wait-notify关键字，写一段代码演示生产者-消费者问题
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class Consumer implements Runnable {
	
	private EventStorage storage;

	/*
	 * 构造方法
	 */
	public Consumer(EventStorage storage) {
		this.storage = storage;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			storage.get();
		}
	}
}