package day01;

import java.util.Scanner;

public class StringManupilationAndMethodCreation02 {
	//	Palindrom, tersten okunuşu da aynı olan cümle, sözcük ve sayılara denilmektedir.
    // Iki String palindrome mi degil mi kontrol method kullanarak yapin. Stringin ters cevrilmis hali ile esitligi
    // Ornegin kutuk 12321 ey edip adanada pide ye Reverse String

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz");
        String str1 = scan.nextLine();

        System.out.println(isPalindrome(str1));
        	scan.close();
    }

    public static boolean isPalindrome(String kelime) {
        StringBuilder sb = new StringBuilder(kelime);
        //sb.append(kelime);
        return kelime.equals(sb.reverse().toString());

    }


}
