package tekradday01;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramiArraySplitIleYapma {

	public static void main(String[] args) {
		//ANAGRAM aynı harflerle yazılan ama harfleri yer değiştirince ayrı anlama gelen sözcük; 
		//örneğin rakı sözcüğünün harfleri yer değiştirince ortaya çıkan ırak/karı/arık sözcükleri birer anagramdır.
		// Iki String anagram mi degil mi kontrol method kullanarak yapin
		// Anagram = Mary ARMY Yamr
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 tane String giriniz");
		String str1 = scan.next();
		String str2 = scan.next();
		
		System.out.println(isAnagram(str1,str2));// burda ekrana tru veya yada yanlis yazdirir.
		
		boolean sonuc=isAnagram(str1,str2);
		if (sonuc) {
			System.out.println("Anagramdir");
		} else {
			System.out.println("Anagramdir degildir");
		}
		
		scan.close();
	}

	public static boolean isAnagram(String str1, String str2) {
		
		String arr1[]=str1.toLowerCase().split("");
		String arr2[]=str2.toLowerCase().split("");//split kelimesini burada her harfi ayirmada kullanmisiz
		//System.out.println(Arrays.toString(arr1));//Burada String verilen bir kelime ile arrays kullanarak her harfi ayirdik
		Arrays.sort(arr1);// burada da girdigimiz kelimeleri alfabetik sirasina gore duzenliyor.
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
		
		
	}

}
