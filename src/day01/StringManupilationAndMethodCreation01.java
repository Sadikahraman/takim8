package day01;

import java.util.Arrays;
import java.util.Scanner;

public class StringManupilationAndMethodCreation01 {
	//ANAGRAM aynı harflerle yazılan ama harfleri yer değiştirince ayrı anlama gelen sözcük; 
	//örneğin rakı sözcüğünün harfleri yer değiştirince ortaya çıkan ırak/karı/arık sözcükleri birer anagramdır.
	// Iki String anagram mi degil mi kontrol method kullanarak yapin
	// Anagram = Mary ARMY Yamr

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 tane String giriniz");
		String str1 = scan.next();
		String str2 = scan.next();

		boolean d = isAnagram(str1, str2);
		if (d) {
			System.out.println("Anagramdir");
		} else
			System.out.println("degildir");
		scan.close();
	}

	public static boolean isAnagram(String cumle1, String cumle2) {
		String[] arr1 = cumle1.toLowerCase().split("");
		String[] arr2 = cumle2.toLowerCase().split("");
		Arrays.sort(arr1);// Mary -> amry
		Arrays.sort(arr2);// ARMY -> amry

		return Arrays.equals(arr1, arr2);
	}

}