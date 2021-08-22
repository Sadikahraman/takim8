package tekradday01;

import java.util.Scanner;

public class forloopyidiz {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen kac satirli olacaginin yaziniz");
		int satir = scan.nextInt();

		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < satir-i; j++) {
				System.out.print("*" + " ");
			}
				System.out.println("");
		}
		
		for (int i = 0; i < satir; i++) {
			for (int j = satir; j >=satir-i; j--) {
				System.out.print("+"+" ");
			}
				System.out.println();
			}
		
			scan.close();
		}

	}


