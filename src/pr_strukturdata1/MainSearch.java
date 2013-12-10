package pr_strukturdata1;

import java.util.Arrays;
import java.util.Scanner;
public class MainSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z;
        int[] data = {8, 3, 45, 78, 92, 40, 12, 9, 67, 43, 32, 19};
        Arrays.sort(data);
        System.out.print("masukan data untuk sekuensial search =  ");
        x = input.nextInt();
        System.out.print("masukan data untuk binary search =  ");
        y = input.nextInt();
        System.out.print("masukan data untuk interpolation search =  ");
        z = input.nextInt();
        System.out.println(Larik.SekuensialSearch(data, x));
        System.out.println(Larik.BinarySearch(data, y));
        System.out.println(Larik.InterpolationSearch(data, z));
    }
}
