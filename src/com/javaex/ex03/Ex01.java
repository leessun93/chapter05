package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		 
		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt"); // 아웃풋 스트림 개념인데 읽고 써서보낸다고 파일 롸이터로 사용
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 댕댕땡 ");
		bw.newLine(); //줄바꿈
		bw.write("어서모이자");
		bw.newLine();
		bw.write("쓰앵님이 우리를");
		bw.newLine();
		bw.write("긷허브리신다");
		
		
		
		bw.close();
		
		
		
		
		

				
	}

}
