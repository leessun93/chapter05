package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		InputStream fr = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader is = new InputStreamReader(fr,"UTF-8");
		BufferedReader br = new BufferedReader(is);
		
		List<Person> pList = new ArrayList<Person>();
		
		Scanner sc = new Scanner(System.in);
	
		
		while(true) {
			String str = br.readLine();
			if(str == null) {
				break;
			}
			String[] Array = str.split(",");
			String name = Array[0];
			String hp = Array[1];
			String company = Array[2];			
			
			Person p01 = new Person(name, hp, company);
			pList.add(p01);
		
			}
			
		String p = sc.nextLine();
		String[] Array = p.split(",");
		String name = Array[0];
		String hp = Array[1];
		String company = Array[2];
		
		Person p01 = new Person(name, hp, company);
		pList.add(p01);
		
		
		for(int i=0; i<pList.size(); i++) {
			System.out.println("이름  :" + pList.get(i).getName());
			System.out.println(" 핸드폰" + pList.get(i).getHp());
			System.out.println(" 회사" + pList.get(i).getCompany());
			System.out.println("");
		}
	
		Writer wr = new FileWriter("C:\\javaStudy\\file\\PhoneDBa.txt");
		BufferedWriter bw = new BufferedWriter(wr);
	
		for(int i = 0; i< pList.size();i++) {
			String str = pList.get(i).getName()+","+ pList.get(i).getHp()+","+pList.get(i).getCompany();
			bw.write(str);
			bw.newLine();
		}
		
		
		br.close();
		sc.close();
		bw.close();
	}

}
