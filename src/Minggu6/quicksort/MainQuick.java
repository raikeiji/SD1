package Minggu6.quicksort;
public class MainQuick {
    public static void main(String[] args) {
        int [] data={6,1,6,2,2,6,8,3,1};
        System.out.println("Data yang belum diurutkan");
        Quick.cetak(data);
        System.out.println("");
        System.out.println("Data yang sudah diurutkan");
        Quick.quickSortHelper(data);
    }
}
