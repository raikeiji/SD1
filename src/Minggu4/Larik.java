/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4;

import java.util.Scanner;
import sun.misc.Compare;

/**
 *
 * @author Administrator
 */
public class Larik {
//
//    public static void cetakmahasiwa(Mahasiswa[] data) {
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i].getNama());
//        }
//    }

    public static int SekuensialSearch(Object[] data, Object cari) {
        //System.out.println("sekuensial search");
        for (int i = 0; i < data.length; i++) {
            if (((Mahasiswa)data[i]).compareTo(cari)==0) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(Object[] data, Object cari) {

        int Awal_Index = 0, 
                akhir_Index = data.length - 1, 
                midIndex;
       // System.out.println("binary search");
        while (Awal_Index <= akhir_Index) { // langkah 2
            midIndex = (Awal_Index + akhir_Index) / 2;// langkah 3
            if (((Mahasiswa)data[midIndex]).compareTo(cari)==0) {  //langkah 4
                return midIndex;
            } else {
                if (((Mahasiswa)data[midIndex]).compareTo(cari)==0) {  // langkah 5
                    akhir_Index = midIndex - 1;//langkah 5
                } else {
                    Awal_Index = midIndex + 1; //langkah 5
                }
            }
        }
        return -1;
    }

    public static int InterpolationSearch(Object[] data, Object cari) {

       // System.out.println("interpolation  search");
        int Awal_Index = 0, akhir_Index = data.length - 1, midIndex;
        while (Awal_Index <= akhir_Index) { // langkah 2
//            midIndex = Awal_Index + ((cari - data[Awal_Index] * (akhir_Index - Awal_Index))
//                    / (data[akhir_Index] - data[Awal_Index]));// langkah 3
            midIndex=Awal_Index+((((Mahasiswa)cari).getNim()
                    -((Mahasiswa)data[Awal_Index]).getNim())
                    *(akhir_Index-Awal_Index))
                    /(((Mahasiswa)data[akhir_Index]).getNim()
                    -((Mahasiswa)data[Awal_Index]).getNim());
            if (((Mahasiswa)data[midIndex]).compareTo(cari)==0) {  //langkah 4
                return midIndex;//langkah 4
            } else {
                if (((Mahasiswa)data[midIndex]).compareTo(cari)>0) {  // langkah 5
                    akhir_Index = midIndex - 1;//langkah 5
                } else {
                    Awal_Index = midIndex + 1; //langkah 5
                }
            }
        }
        return -1;
    }
}
