package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException{
	 
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\MS949.txt"); //빨대
		InputStreamReader isr = new InputStreamReader(is, "MS949"); // InputStreamReader는 여러 나라 말을 번역해주는 번역기 코드임
		BufferedReader br = new BufferedReader(isr);// 깔때기
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
			
		}
		
		br.close();
	}

}
