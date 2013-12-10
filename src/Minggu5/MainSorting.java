/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;

/**
 *
 * @author admin
 */
public class MainSorting {
    public static void main(String[] args) {
        int [] data={8,4,2,6,3,100,1};
        System.out.println("Data yang belum diurutkan : ");
        Larik.cetak(data);
        System.out.println("");
        System.out.println("Data yang sudah diurutkan dengan insertion sorting: ");
        Larik.Insertionsorting(data);
        Larik.cetak(data);
        System.out.println("Data yang sudah diurutkan dengaan selection sorting");
        Larik.selectionsorting(data);
        Larik.cetak(data);
        System.out.println("Data yang sudah diurutkan dengaan Bubble sorting");
        Larik.bubblesorting(data);
        Larik.cetak(data);
    }
}
