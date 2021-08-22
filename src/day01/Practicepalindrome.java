package day01;

import java.util.Scanner;

public class Practicepalindrome {

	public static void main(String[] args) {

		//  Iki String palindrome mi degil mi kontrol method kullanarak yapin. 
		//	Stringin ters cevrilmis hali ile esitligi
		//  Ornegin "kutuk", "12321", "ey edip adanada pide ye" Reverse String

		
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Lutfen bir string giriniz");
//
//		String str = scan.nextLine();
//
//		String str2 = "";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//
//			str2 += str.charAt(i);
//
//		}
//		if (str.equals(str2)) {
//
//			System.out.println("Palindrom");
//		} else
//			System.out.println("Palindrom degildir");
		
//		scan.close();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz");
		String str1=scan.nextLine();
		String str2="";
		
		for (int i = str1.length()-1; i >=0; i--) {
			
			str2+=str1.charAt(i);
			//System.out.println(str2); // buraya koyarsam adim adim goruruz ben dongunun disina koyuyorum ki son islemi goriyim diye
	
		}System.out.println("Girdigimiz kelime tersten cevrilmis hali: " + str2);
		
		if (str1.equals(str2)) {
			System.out.println("Tebrik ederim*****************\nKelimelerin onden ve arkadan okunuslari aynidir");
		}
		else 
			System.out.println("Kelimelerin onden ve arkadan yazilislari ayni degildir.");
		scan.close();
	}

	}


