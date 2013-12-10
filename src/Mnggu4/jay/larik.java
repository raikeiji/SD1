/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Mnggu4.jay;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class larik {
public static int Interpolasi(Object[] data, Object key) {
        int indexAwal = 0;
        int indexAkhir = data.length - 1;
        int indexTengah;
        while (indexAwal <= indexAkhir) {
            indexTengah = indexAwal
                    + ((((Mahasiswa) key).getNim()
                    - ((Mahasiswa) data[indexAwal]).getNim())
                    * (indexAkhir - indexAwal))
                    / (((Mahasiswa) data[indexAkhir]).getNim()
                    - ((Mahasiswa) data[indexAwal]).getNim());
            if (((Mahasiswa) data[indexTengah]).compareTo(key) == 0) {
                return indexTengah;
            } else {
                if (((Mahasiswa) data[indexTengah]).compareTo(key) > 0) {
                    indexAkhir = indexTengah - 1;
                } else {
                    indexAwal = indexTengah + 1;
                }
            }
        }
        return -1;    }

    public static int binary(Object[] data, Object key) {
        int indexAwal = 0;
        int indexAkhir = data.length - 1;
        int indexTengah = 0;
        while (indexAwal <= indexAkhir) {
            indexTengah = (indexAwal + indexAkhir) / 2;
            if (((Mahasiswa) data[indexTengah]).compareTo(key) == 0) {
                return indexTengah;
            } else {
                if (((Mahasiswa) data[indexTengah]).compareTo(key) > 0) {
                    indexAkhir = indexTengah - 1;
                } else {
                    indexAwal = indexTengah + 1;
                }
            }
        }
        return -1;
    }

    public static int SequentialSearch(Object[] data, Object key) {
        for (int counter = 0; counter < data.length; counter++) {
            if (((Mahasiswa) data[counter]).compareTo(key) == 0) {
                return counter;
            }
        }
        return -1;
    }
}
