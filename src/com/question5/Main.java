package com.question5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	static TreeSet<String> words=new TreeSet<>();
	static ArrayList<String> word=new ArrayList<>();
	public static void calculate(String str) {
		
		String[] strArr=str.split(" ");
	
		
		
		for(String s:strArr) {
			words.add(s);
	}
//			strArr=str.split("!");
//			if("!".equals(s)) {
//				continue;
//			}
//			strArr=str.split(",");
//			if(",".equals(s)) {
//				continue;
//			}
//			strArr=str.split(";");
//			if(";".equals(s)) {
//				continue;
//			}
//			strArr=str.split(":");
//			if(":".equals(s)) {
//				continue;
//			}
//			
//			else {
//				strArr=str.split(" ");
//				word.add(s);
//			}
	//	}
		System.out.println("=================================");

		System.out.println("Number of words "+strArr.length+" Number of unique words "+words.size());
		System.out.println(words);
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Studnet Article: ");
		String article=sc.nextLine();
		
		article=article.toLowerCase();

		calculate(article);
		
	}

}
