package Minggu6;
public class MainSorting {
    public static void main(String[] args) {
        Mahasiswa data[] = {new Mahasiswa("adi", 7), new Mahasiswa("Cecep", 5),
            new Mahasiswa("Bayu", 2)};
        System.out.println("Data yang belum diurutkan");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i].getNim());
        }
        System.out.println("\nData yang sudah diurutkan insertion sorting object");
        Larik.Insertionsorting(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i].getNim());
        }
        System.out.println("\nData yang sudah diurutkan selection sorting object");
        Larik.selectionsorting(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i].getNim());
        }
        System.out.println("\nData yang sudah diurutkan Bubble sorting object");
        Larik.bubblesorting(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i].getNim());
        }
    }
}
