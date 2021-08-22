package tekradday01;

import java.util.Scanner;

public class Practicepalindrome {

	public static void main(String[] args) {
		// Iki String palindrome mi degil mi kontrol method kullanarak yapin.
		// Stringin ters cevrilmis hali ile esitligi
		// Ornegin "kutuk", "12321", "ey edip adanada pide ye" Reverse String

		Scanner scan = new Scanner(System.in);

		System.out.println("Kullanicidan bir kelime giriniz");
		String str1 = scan.nextLine();

		String str2 = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 += str1.charAt(i);

		}
		System.out.println(str2);

		if (str1.equals(str2)) {
			System.out.println("Sayilarin onden ve tersten yazilislari aynidir");
		} else {
			System.out.println("Sayilarin onden ve tersten yazilislari ayni degildir");
		}
			scan.close();
	}

}
