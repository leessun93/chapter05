package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

public class Ex04 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt"); 
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDBadd.txt");
		Output
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
			break;
			
		}
		
		String[] info = str.split(",");
		String name = info[0];
		String hp = info[1];
		String company = info[2];
		
		System.out.println("이름 :" + name);
		System.out.println("핸드폰 :" + hp);
		System.out.println("회사 :" + company);
		System.out.println("");
		}
	
		bw.write("이선흠", 010-2674-7151, 02-3333-9879);
	
	br.close();	
	bw.close();
	}
	
}
