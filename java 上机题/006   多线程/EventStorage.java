package com.dingya.thread;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class EventStorage {
	
	// 日期列表大小上限
	private int maxSize;

	// 日期列表
	private List<Date> dates;

	/*
	 * 构造方法
	 */
	public EventStorage() {
		maxSize = 20;
		dates = new LinkedList<Date>();
	}

	/*
	 * 在列表中添加日期
	 */
	public synchronized void set() {
		while (dates.size() == maxSize) { 
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		dates.add(new Date());
		System.out.printf("Set: %d%n", dates.size());
		notifyAll();
	}

	/*
	 * 在列表中删除日期
	 */
	public synchronized void get() {
		while (dates.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.printf("Get: %d: %s%n", dates.size(), ((LinkedList<?>) dates).poll());
		notifyAll();
	}
}