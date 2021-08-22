package day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        /*  Write a program that deletes the letters 'a' from the names in the list given as input.
        INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
        OUTPUT: [Veli,Omer]         */

        Scanner scan = new Scanner(System.in);
        List<String> girilenIsimler = new ArrayList<>();
        System.out.println("Lutfen listeye eklemek icin 5 tane isim  giriniz :");
        String isim;
        String karakter;

        do {
            isim = scan.next();
            girilenIsimler.add(isim);
        }while(girilenIsimler.size()<5);

        //System.out.println(girilenIsimler);
        System.out.println("Lutfen bir karakter giriniz :");
        karakter = scan.next().substring(0,1);

        for(int i = 0; i < girilenIsimler.size(); i++) {
            if(girilenIsimler.get(i).contains(karakter)){
                girilenIsimler.remove(i);
                i--;
            }
            System.out.println("q");
        }


        System.out.println(" Girilen isimlerden icinde "+karakter+" harfi bulundurmayanlar sunlardir :"+girilenIsimler);
    }

    /*
   
     */

}
