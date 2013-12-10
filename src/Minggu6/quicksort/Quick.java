package Minggu6.quicksort;
public class Quick {
    public static void cetak(int[] cetak){
        for (int i = 0; i < cetak.length; i++) {
            System.out.print(cetak[i]+" ");
            
        }
    }
    public static void quickSortHelper(int array[]){
        quicksort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            System.out.print(j+" ");
        }
    }
    public static void quicksort(int[] array, int awal, int akhir){
        int i,j;
        if (awal<akhir){
            i=awal+1; j=akhir;
            while(i<=akhir&&(array[i]<=array[awal])){
                i++;
            }
            while(j>awal&&(array[j]>array[awal])){
                j--;
            }
            while(i<j){
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
                while(i<=akhir && array[i]<=array[awal]){
                    i++;
                }
                while(j>awal && array[j]> array[awal]){
                    j--;
                }
            }
            int tukar=array[awal];
            array[awal]=array[j];
            array[j]=tukar;
            quicksort(array,awal, j-1);
            quicksort(array, j+1, akhir);
        }
    }
}
