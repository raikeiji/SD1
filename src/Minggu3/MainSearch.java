/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MainSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int[] data = {8, 3, 45, 78, 92, 40, 12, 9, 67, 43, 32, 19};
        Arrays.sort(data);
        System.out.print("masukan data untuk sekuensial search =  ");
        x = sc.nextInt();
        System.out.print("masukan data untuk binary search =  ");
        x = sc.nextInt();
        System.out.print("masukan data untuk interpolation search =  ");
        x = sc.nextInt();
        System.out.println(Larik.SekuensialSearch(data, x));
        System.out.println(Larik.BinarySearch(data, x));
        System.out.println(Larik.InterpolationSearch(data, x));
    }
}