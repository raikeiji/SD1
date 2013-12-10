/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author admin
 */
 //source : http://www.mkyong.com/java/java-object-sorting-example-comparable-and-comparator/
//Sort an ArrayList
public class Fruits2 {
    public static void main(String[] args) {
        List<String> fruits=new ArrayList<String>();
        fruits.add("pineapples");
        fruits.add("apple");
        fruits.add("manggo");
        fruits.add("banana");
        Collections.sort(fruits);
        int i=1;
        for(String temp: fruits){
            System.out.println("fruits "+i+":"+temp);
            i++;
        }
    }
   
    
}
