package tekradday01;

import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {
		// Girdigimiz sayilarin faktoriyelini yani 1 den o sayiya kadar carpimlarini
		// lutfen bulunuz

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen faktoriyelinin bulmak istedigin sayiyi giriniz");
		int sayi = scan.nextInt();

		int carpim = 1;

		for (int i = 1; i <= sayi; i++) {
			carpim *= i;

		}
		System.out.println("Girdigimiz " + sayi + " sayisinin faktoriyeli: " + carpim + " dir");
		scan.close();

	}

}
