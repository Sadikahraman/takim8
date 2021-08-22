package tekradday01;

import java.util.Scanner;

public class IkiStringPalindroremiStringbuliderReverse {

	
	public static void main(String[] args) {
		// Iki String palindrome mi degil mi kontrol method kullanarak yapin. Stringin ters cevrilmis hali ile esitligi
	    // Ornegin kutuk 12321 ey edip adanada pide ye Reverse String

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz");
		String kelime1=scan.nextLine();
		
		System.out.println(Palindrome(kelime1));
			scan.close();
	}

	public static boolean Palindrome(String kelime1) {
		StringBuilder kelime2=new StringBuilder(kelime1);
		//System.out.println(kelime2);
		return kelime1.equals(kelime2.reverse().toString());
	
		
	}

}
