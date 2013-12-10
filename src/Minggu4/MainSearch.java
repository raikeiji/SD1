/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu4;

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
        Scanner input = new Scanner(System.in);
        int x = 0;
        System.out.println("Masukkan jumlah mahasiswa:");
        x = input.nextInt();
        Mahasiswa[] mhs = new Mahasiswa[x];
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Nama " + (i + 1) + " : ");
            String nama = input.next();
            System.out.println("NIM " + (i + 1) + " : ");
            int nim = input.nextInt();
            mhs[i].setNama(nama);
            mhs[i].setNim(nim);
        }
        Mahasiswa mhs2 = new Mahasiswa();
        System.out.println("Masukkan tebakan NIM : ");
        int teb = input.nextInt();
        mhs2.setNim(teb);
        Arrays.sort(mhs);
        if (teb == mhs2.getNim()) {
            System.out.println("terletak dilarik");
            System.out.println("dengan cara sekuential searching terletak dilarik " 
                    + Larik.SekuensialSearch(mhs, mhs2));
            System.out.println("dengan cara binary searching terletak dilarik " 
                    + Larik.BinarySearch(mhs, mhs2));
            System.out.println("dengan cara interpolation searching terletak dilarik " 
                    + Larik.InterpolationSearch(mhs, mhs2));

            Arrays.sort(mhs);
        } else {
            System.out.println("tebakan yang anda masukkan salah");
        }
    }
}