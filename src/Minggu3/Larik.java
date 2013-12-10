/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Larik {

    public static void cetak(int[] data) {
        //for (Object d:data){
        //   System.out.println(d);}
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static String SekuensialSearch(int[] data, int cari) {
        System.out.println("sekuensial search");
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[i] == cari) {
                return "data ditemukan";
            }
        }
        return "tidak ditemukan";
    }

    public static String BinarySearch(int[] data, int cari) {

        int Awal_Index = 0, akhir_Index = data.length - 1, midIndex;
        System.out.println("binary search");
        while (Awal_Index <= akhir_Index) { // langkah 2
            midIndex = (Awal_Index + akhir_Index) / 2;// langkah 3
            if (data[midIndex] == cari) {  //langkah 4
                return "Data ditemukan di index ke = " + midIndex;
            } else {
                if (data[midIndex] > cari) {  // langkah 5
                    akhir_Index = midIndex - 1;//langkah 5
                } else {
                    Awal_Index = midIndex + 1; //langkah 5
                }
            }
        }
        return "data tidak ditemukan";
    }

    public static String InterpolationSearch(int[] data, int cari) {

        System.out.println("interpolation  search");
        int Awal_Index = 0, akhir_Index = data.length - 1, midIndex;
        while (Awal_Index <= akhir_Index) { // langkah 2
            midIndex = Awal_Index + ((cari - data[Awal_Index] * (akhir_Index - Awal_Index))
                    / (data[akhir_Index] - data[Awal_Index]));// langkah 3
            if (data[midIndex] == cari) {  //langkah 4
                return "Data ditemukan = " + midIndex;//langkah 4
            } else {
                if (data[midIndex] > cari) {  // langkah 5
                    akhir_Index = midIndex - 1;//langkah 5
                } else {
                    Awal_Index = midIndex + 1; //langkah 5
                }
            }
        }
        return "Data tidak ditemukan";
    }
}
