package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		//phone DB.txt접속
		Reader fr = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader bfr = new BufferedReader(fr);
		
		//ArrayList 메모리에 올리기
		List<Person> pList = new ArrayList<Person>();
		
		while(true) {
			//한줄씩 읽는다
			String line = bfr.readLine();
			if(line == null) {//마지막 끝
				break;
			}
			
			
			//마지막이 아니면 ,로 구분한다
			String[] dArray = line.split(",");
			String name = dArray[0];
			String hp = dArray[1];
			String company = dArray[2];
			
			
			//Person객체를 생성하고 값을 넣어준다
			Person p01 = new Person(name, hp, company);
			//***********리스트에 추가해준다*********
			pList.add(p01);
		}
		
		String inputTxt = sc.nextLine();
		String[] dArray = inputTxt.split(",");
		String name = dArray[0];
		
		
		//텍스트용 풀력 toString()사용
		System.out.println(pList.toString());
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름  :" + pList.get(i).getName());
			System.out.println(" 핸드폰" + pList.get(i).getHp());
			System.out.println(" 핸드폰" + pList.get(i).getCompany());
			System.out.println("");
		}
	
		
		bfr.close();
	}

}
