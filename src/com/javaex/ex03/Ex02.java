package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\javaStudy\\file\\MS949.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		//글자열은 숫자랑 다르게 마지막에 -1이 아닌 null이 오면 끝이난다
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다 --> 줄바꿈기호는 제외하고
			if(str==null) {
				break;  //파일 읽을때 종종 사용한다
			}
			System.out.println(str);
		}
		
		
		
		
		
		
		
		
		
		
		br.close();
		
		
	}

}
