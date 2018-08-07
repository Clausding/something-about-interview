package com.dingya.thread;

/**
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class Producer implements Runnable{
	
	private EventStorage storge;

	/*
	 * 构造方法
	 */
	public Producer(EventStorage storage) {
		this.storge = storage;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			storge.set();
		}
	}

}