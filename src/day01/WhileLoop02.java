package day01;

import java.util.Scanner;

public class WhileLoop02 {
    // Kullanicinin girdigi sayilardan maxi ve min'i bulun method kullanarak yapin
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        minMaxBul();
        
    }

    public static void minMaxBul(){
        int min = Integer.MAX_VALUE; // 2342394823984289
        int max = Integer.MIN_VALUE; //-2873423784278478


        while(true){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scan.nextInt();

            if(sayi>max){
                max = sayi;
            }

            if(sayi<min){
                min = sayi;
            }

            System.out.println("Deger girmeye devam etmek ister misiniz? Evet ise y Hayir ise h ye basiniz");
            char secim = scan.next().charAt(0);
            if(secim=='h'){
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }



}

