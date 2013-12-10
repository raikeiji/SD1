package pr_strukturdata1;

import java.util.Scanner;
public class Larik {

    public static void cetak(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static String SekuensialSearch(int[] data, int cari) {
        System.out.println("SEKUENTIAL SEARCH");
        System.out.println("==================");
        for (int i = 0; i <= data.length - 1; i++) {
            if (data[i] == cari) {
                return "Data ditemukan\n";
            }
        }
        return "tidak ditemukan\n";
    }

    public static String BinarySearch(int[] data, int cari) {

        int Awal_Index = 0, akhir_Index = data.length - 1, midIndex;
        System.out.println("BINARY SEARCH");
        System.out.println("=============");
        while (Awal_Index <= akhir_Index) { 
            midIndex = (Awal_Index + akhir_Index) / 2;
            if (data[midIndex] == cari) {  
                return "Data ditemukan\n";
            } else {
                if (data[midIndex] > cari) {
                    akhir_Index = midIndex - 1;
                } else {
                    Awal_Index = midIndex + 1; 
                }
            }
        }
        return "data tidak ditemukan\n";
    }
    public static String InterpolationSearch(int[] data, int cari) {
        System.out.println("INTERPOLATION SEARCH");
        System.out.println("====================");
        int Awal_Index = 0, akhir_Index = data.length - 1, midIndex;
        while (Awal_Index <= akhir_Index) {
            midIndex = Awal_Index + ((cari - data[Awal_Index] * (akhir_Index - Awal_Index))
                    / (data[akhir_Index] - data[Awal_Index]));
            if (data[midIndex] == cari) { 
                return "Data ditemukan\n";
            } else {
                if (data[midIndex] > cari) {  
                    akhir_Index = midIndex - 1;
                } else {
                    Awal_Index = midIndex + 1;
                }
            }
        }
        return "Data tidak ditemukan\n";
    }}
