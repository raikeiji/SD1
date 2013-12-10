/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu11;

/**
 *
 * @author admin
 */
public class MainStatic {
    public static void main(String[] args) {
        StackStatis s=new StackStatis(3);
        s.push(8);
        s.push(5);
        s.push(7);
        s.pop();
        System.out.println(s);
    }
}
