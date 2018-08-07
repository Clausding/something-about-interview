package com.dingya.thread;

/**
 * 1.j是int类型的变量。设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。
 * 
 * @date 2018年4月20日
 * @author dingya
 */
public class P1 {
	public static void main(String[] args) {
		Data data = new Data();
		AddThread aThread = new AddThread(data);
		DecreaseThread dThread = new DecreaseThread(data);
		for (int i = 0; i < 2; i++) {
			new Thread(aThread, "线程_增加功能" + i).start();
			new Thread(dThread, "线程_减少功能" + i).start();
		}
	}
}

/*
 * 减少线程
 */
class DecreaseThread implements Runnable {
	private Data data;

	public DecreaseThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		data.decrease();
	}
}

/**
 * 增加线程
 */
class AddThread implements Runnable {
	private Data data;

	public AddThread(Data data) {
		this.data = data;
	}

	@Override
	public void run() {
		data.add();
	}
}

/*
 * Data类，存变量j和加减操作的同步方法
 */
class Data {
	private int j = 0;
	private String format = "线程名:%s	操作:%s	j的值:%d%n";

	public synchronized void add() {
		j += 1;
		System.out.printf(format, Thread.currentThread().getName(), "j + 1", j);
	}

	public synchronized void decrease() {
		j -= 1;
		System.out.printf(format, Thread.currentThread().getName(), "j - 1", j);
	}
}