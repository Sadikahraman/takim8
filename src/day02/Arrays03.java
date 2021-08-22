package day02;

import java.util.Arrays;

public class Arrays03 {
    /* 2 int array parametre isteyen bir method yazin ve bu iki array'i birlestirin ve yazdirin
     *
     * Input1={1,2,3,4}
     * Input2={5,6}
     *
     * Output={1,2,3,4,5,6}
     *
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int arr2[] = {5,6};
        System.out.println(arrBirlestirme2(arr, arr2));
        System.out.println(arrBirlestirme(arr, arr2));
    }

    public static String arrBirlestirme(int arr[], int arr2[]){
        int arrReal[] = new int[arr.length + arr2.length];


        for(int i = 0; i <arr.length; i++){
            arrReal[i] = arr[i];
        }
        for(int i = 0; i <arr2.length; i++){
            arrReal[arr.length+i] = arr2[i];
        }

        return Arrays.toString(arrReal);
    }

    public static String arrBirlestirme2(int arr[], int arr2[]){
        int arrReal[] = new int[arr.length + arr2.length];
        int index = 0;
        int index1 = 0;

        for(int i = 0; i < arr.length; i++){
            arrReal[index] = arr[i];
            index++;
        }

        for(int i = 0; i < arr2.length; i++){
            arrReal[index1+index] = arr2[i];
            index1++;
        }

        return Arrays.toString(arrReal);
    }



}

