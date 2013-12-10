/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mnggu4.jay;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MahasiswaObjek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah data : ");
        data = sc.nextInt();
        Mahasiswa mhs[] = new Mahasiswa[data];
        for (int i = 0; i < data; i++) {
            mhs[i] = new Mahasiswa();
            System.out.print("Masukan Nama orang ke " + (i + 1) + ":");
            String nama = sc.next();
            System.out.print("Masukan Nim " + (i + 1) + " :");
            int Nim = sc.nextInt();
            mhs[i].setNama(nama);
            mhs[i].setNim(Nim);
        }
        Mahasiswa ma = new Mahasiswa();
        System.out.print("Masukan nim yang dicari : ");
        int nim = sc.nextInt();
        ma.setNim(nim);
        Arrays.sort(mhs);
        System.out.println("indeks yang anda cari Interpolasi dari Search : "
                + larik.Interpolasi(mhs, ma));
        Arrays.sort(mhs);
    }
}
