//Tugas Struktur Data 1
//Nama: Engelbertus Vione
//NIM:125314112

package Minggu11;
public class MainList {
    public static void main(String[] args) {
        List l=new List();
        l.addFirst(1);
        l.cetak();
        System.out.println("Data pertama (1) sudah ditambahkan");
        l.addLast(2);
        l.cetak();
        System.out.println("data terakhir (2) ditambahkan");
        l.addFirst(3);
        l.cetak();
        System.out.println("data pertama (3) ditambakan");   
        l.addLast(4);
        l.cetak();
        System.out.println("data terakhir (4) ditambahkan");
        l.removefirst();
        l.cetak();
        System.out.println("menghapus data pertama (3)");
        l.removeLast();
        l.cetak();
        System.out.println("menghapus data terkahir (4)");
        if (l.cari(3))
            System.out.println("data ditemukan");
        else
            System.out.println("data tidak ditemukam ");
        //l.cetak();
    }
}
