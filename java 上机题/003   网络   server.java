package com.dingya.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 * 
 * @date 2018年2月11日
 * @author dingya
 */
public class Server {
	private ServerSocket ss;
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	/*
	 * 构造方法
	 */
	public Server() {
		try {
			ss = new ServerSocket(8888);
			while(true) {
				socket = ss.accept();
				String remoteIP = ss.getInetAddress().getHostAddress();
				int remotePort = ss.getLocalPort();
				System.out.printf("客户端接入，IP：%s:%s%n", remoteIP, remotePort);
				
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = in.readLine();
				System.out.printf("客户端说：%s%n", line);
				
				out = new PrintWriter(socket.getOutputStream(), true);
				out.print("你的消息已经收到了");
				
				out.close();
				in.close();
				socket.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * 开启服务器
	 */
	public static void main(String[] args) {
		new Server();
	}
}









