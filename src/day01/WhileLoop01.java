package day01;

import java.util.Scanner;

public class WhileLoop01 {
	
    // Kullanicidan sayilar alin kullanici giris yapmayi birakmak istedigi zaman donguyu kirip girdigi
    // sayilardan ciftlerin toplamini ayri bir degiskende teklerin toplamini ayri bir degiskende tutun ve yazdirin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ciftToplam = 0;
        int tekToplam = 0;

        int count1=0;
        int count2=0;
        
        while(true){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scan.nextInt();
            if(sayi %2==0){
                ciftToplam += sayi;
                count2++;
            }else{
                tekToplam += sayi;
                count1++;
            }
            System.out.println("Sayi girmeye devam etmek ister misiniz? Cikmak icin q'ya basiniz");
            char secim = scan.next().charAt(0);
            if(secim=='q'){
                break;
                
            }
        // while dongusundeki kosulu true olarak belirlerseniz kesinlikle unutmamaniz gereken sey break komutudur.
        }
        System.out.println("Cift sayilarin Toplami: " +ciftToplam+ " ve"+ count2+" kere cift sayikullanilmistir");
        System.out.println("tek sayilarin Toplami: " +tekToplam+ " ve"+ count1+" kere tek sayikullanilmistir");
        scan.close();
    }
}

