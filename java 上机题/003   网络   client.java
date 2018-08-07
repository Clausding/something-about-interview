package com.dingya.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 客户端
 * 
 * @date 2018年2月11日
 * @author dingya
 */
public class Client {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;

	/*
	 * 构造方法
	 */
	public Client() {
		try {
			System.out.println("Try to connect to 127.0.0.1:8888"); 
			socket = new Socket("127.0.0.1", 8888);
			System.out.println("成功连接到服务器"); 
			System.out.println("请输入要说的话"); 
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			
			out = new PrintWriter(socket.getOutputStream(), true);
			out.println(line);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line2 = in.readLine();
			System.out.printf("接收的消息：%s", line2);

			out.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * 开启客户端
	 */
	public static void main(String[] args) {
		new Client();
	}
}
