package day01;

import java.util.Scanner;

public class Faktoriyel {
	public static void main(String[] args) {
		
		/// sadi kahraman

		// Girdigimiz sayilarin faktoriyelini yani 1 den o sayiya kadar carpimlarini
		// lutfen bulunuz

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Kullanicidan bir sayi giriniz");
//
//		int sayi = scan.nextInt();
//
//		int carpim = 1;
//
//		for (int i = 1; i <= sayi; i++) {
//
//			carpim = carpim * i;
//
//		}
//		System.out.println("Carpimlarin sonucu : " + carpim);
//		scan.close();

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen faktoriyel yapacak sayiyi giriniz");
		int sayi = scan.nextInt();

		int carpim = 1;

		for (int i = 1; i <= sayi; i++) { // 1x1=1 1x2=2 2x3=6 3x4
			carpim *= i;

		}
		System.out.println("Carpimin sonucu: " + carpim);

		scan.close();

	}

}
