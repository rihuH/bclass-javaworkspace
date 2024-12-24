package com.kh.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerPractice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int portNumber = 1026;
		
		ServerSocket server = null;
		Socket socket = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			
			
			server = new ServerSocket(portNumber);
			System.out.println("응답 기다리는중...");
			socket = server.accept();
			System.out.println("접속한 사용자 : " + socket.getInetAddress().getHostAddress());
			
			pw = new PrintWriter(socket.getOutputStream());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			while(true) {
				String message = br.readLine();
				System.out.println("받은 메시지 : " + message);
				
				System.out.println("보낼 메시지 > ");
				String sendMe = sc.nextLine();
				pw.println(sendMe);
				pw.flush();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				
			}
			
			if(pw != null) {
				pw.close();
			}
			
			try {
				if(socket != null) {
					socket.close();
				}
			} catch(IOException e) {
				
			}
			
			try {
				if(server != null) {
					server.close();
				}
			} catch(IOException e) {
				
			}
			
			sc.close();
			
	}
	}
}
