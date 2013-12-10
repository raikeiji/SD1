/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu5;

/**
 *
 * @author admin
 */
public class Larik {

    public static void cetak(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

    public static void Insertionsorting(int[] sort) {
        for (int i = 1; i <= sort.length - 1; i++) {
            for (int element = i; element >= 1; element--) {
                if (sort[element] < sort[element - 1]) {
                    int tukar=sort[element];
                    sort[element] = sort[element - 1];
                    sort[element-1]=tukar;
                }
            }
        }
    }
    
    public static void selectionsorting(int[] data){
        int mid_index=0;
        for (int i = 0; i < data.length-2; i++) {
            mid_index=1;
            for (int element = i+1; element < data.length-2; element++) {
                if(data[element]<data[mid_index]){
                    mid_index=element;
                }
                int tukar=data[i];
                data[i]=data[mid_index];
                data[mid_index]=tukar;
            }
            
        }
        
    }
    
    public static void bubblesorting(int[] data){
        for (int i = 1; i < data.length-1; i++) {
            for (int element = 0; element < data.length-1; element++) {
                if (data[element]>data[element+1]){
                    int tukar=data[element];
                    data[element]=data[element+1];
                    data[element+1]=tukar;
                }
                
            }
            
        }
    }
}
