package day02;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays01 {
    /*
     * - Bir array olusturun, icerisinde 5 tane int eleman olsun
     * - Arrayin elemanlarini guncelleyin
     * - Array’in elamanlarini yazdirin
     * - Bir for loop olusturun, loop ile arrayin tum elemanlarini 2
     * artirin ve yazdirin
     * - Loop’dan sonra Arrayi yeniden yazdirin
     *
     * - Yeni bir loop olusturun, array’in tum elemanlarini loop ile degistirip
     * sonra tum arrayi yazdirin
     * - Loop’dan sonra Arrayi yeniden yazdirin
     *
     * -elemanlari kalici olarak loop ile degistirin
     */


    public static void main(String[] args) {
        //Bir array olusturun, icerisinde 5 tane int eleman olsun
        int arr[] = new int[5];

        //Arrayin elemanlarini guncelleyin
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 1;
        arr[4] = 15;

        //Array’in elamanlarini yazdirin
        System.out.println(Arrays.toString(arr));

        // Bir for loop olusturun, loop ile arrayin tum elemanlarini 2 artirin ve yazdirin
        for(int each:arr){
            System.out.print(each + 2 + " ");
        }

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + 2);
        }

        System.out.println();
        //Loop’dan sonra Arrayi yeniden yazdirin
        System.out.println(Arrays.toString(arr));

        //Yeni bir loop olusturun, array’in tum elemanlarini loop ile degistirip sonra tum arrayi yazdirin
        for(int i = 0; i < arr.length; i++){
            arr[i] += 2;
        }
        System.out.println(Arrays.toString(arr));

    }





}
