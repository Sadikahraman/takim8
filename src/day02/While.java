package day02;

import java.util.Scanner;

public class While {
	/*
	 * Kullanıcı 0 girinceye kadar sayı istemeye devam eden, girilen sayıları
	 * toplama ekleyen, 0 girdiğinde döngüyü sonlandırıp toplamı ekrana yazan
	 * program
	 * 
	 * Not:Dongumuzun ne kadar donmesi gerektiginden emin olmadigimiz kosullarda do
	 * while loop kullanabiliriz.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int toplama = 0;
		int sayi;
		int sayac = -1;

		do {

			System.out.println("Lutfen sayi giriniz");

			sayi = scan.nextInt();// yukarda int diye olusturdugumuz icin tekrardan basta int yazmamiza gerek yok.
									// suslu parantez icersindeki variable olusturmak istersen en iyisi disarda
									// olustur(main methodun icersinde de diyebiliriz)
									// daha az problem yasarsin disarda olusturdugun variable dongunun icersinde
									// kullanabiliriz.
			toplama += sayi;
			sayac++;

		} while (sayi != 0);// buradaki degisken disarda kaldigi icin biz bunu disarda olusturduk burasi
							// onemli

		System.out.println("Girdiginiz sayilarin toplami: " + toplama + "Ve" + sayac + "kadar sayi girdiniz");
		scan.close();
	}

}
