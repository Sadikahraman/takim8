package tekradday01;

import java.util.Scanner;

public class WhileLoopileCiftveTekSayilarinToplamini {

	public static void main(String[] args) {
		// Kullanicidan sayilar alin kullanici giris yapmayi birakmak istedigi zaman
		// donguyu kirip girdigi
		// sayilardan ciftlerin toplamini ayri bir degiskende teklerin toplamini ayri
		// bir degiskende tutun ve yazdirin

		Scanner scan = new Scanner(System.in);
		int ciftSayiToplama = 0;
		int tekSayiToplama = 0;

		int sayacTek = 0;
		int sayacCift = 0;

		while (true) {
			System.out.println("Lutfen bir sayi giriniz");
			int sayi = scan.nextInt();

			if (sayi % 2 == 0) {
				ciftSayiToplama += sayi;
				sayacCift++;

			} else
				tekSayiToplama += sayi;
			sayacTek++;

			System.out.println("Sayi devam etmek istiyormusunuz sayi giriniz cikmak icin \nq tusuna basiniz");
			char secim = scan.next().charAt(0);
			if (secim == 'q') {
				break;
			}
		}
		System.out.println(sayacCift + "tane cift sayi girilmistir ve bu sayilarin Toplami: " + ciftSayiToplama);
		System.out.println(sayacTek + "tane cift sayi girilmistir ve bu sayilarin Toplami: " + tekSayiToplama);
		scan.close();
	}

}
