/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.util.Arrays;

/**
 *
 * @author admin
 */
 //source : http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
//Sort an Array
public class Fruits {
    public static void main(String[] args) {
        String[] fruit=new String[]{"Pineapple","apple","manggo","orange", "banana"};
        Arrays.sort(fruit);
        int i=0;
        for(String temp: fruit){
            System.out.println("fruits "+fruit[i]+": "+temp);
            i++;
        }
    }
}
