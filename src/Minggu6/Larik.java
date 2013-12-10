package Minggu6;
import sun.misc.Compare;
public class Larik {
    public static void cetak(Mahasiswa[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);

        }
    }
    public static void Insertionsorting(Mahasiswa[] sort) {
        for (int i = 1; i <= sort.length - 1; i++) {
            for (int element = i; element >= 1; element--) {
                if (((Mahasiswa) sort[element]).compareTo(sort[element - 1]) < 0) {
                    Mahasiswa tukar = sort[element];
                    sort[element] = sort[element - 1];
                    sort[element - 1] = tukar;
                }
            }
        }
    }
    public static void selectionsorting(Mahasiswa[] data) {
        int mid_index = 0;
        for (int i = 0; i < data.length - 2; i++) {
            mid_index = 1;
            for (int element = i + 1; element < data.length - 2; element++) {
                if (((Mahasiswa) data[element]).compareTo(data[mid_index]) < 0) {
                    mid_index = element;
                }
                Mahasiswa tukar = data[i];
                data[i] = data[mid_index];
                data[mid_index] = tukar;
            }
        }
    }
    public static void bubblesorting(Mahasiswa[] data) {
        for (int i = 1; i < data.length - 1; i++) {
            for (int element = 0; element < data.length - 1; element++) {
                if (((Mahasiswa) data[element]).compareTo(data[element + 1]) > 0) {
                    Mahasiswa tukar = data[element];
                    data[element] = data[element + 1];
                    data[element + 1] = tukar;
                }
            }
        }
    }
}
