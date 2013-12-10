/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu8Bondan;

/**
 *
 * @author admin
 */
public class linkList {
    private lisNode pertama;
    private lisNode terakhir;
//    private String nama;
//    private int size;
    public linkList(){
        pertama=null;
        terakhir=null;
    }
    public void addPertama(int data){
        if (isEmpety()){
          lisNode  baru = new lisNode(data);
          pertama= baru;
          terakhir=baru;
        }
        else{
            lisNode baru = new lisNode(data);
            baru.setKanan(pertama);
            pertama=baru;
        }
    }
    public void addTerakhir(int data){
        if (isEmpety()){
          lisNode  baru = new lisNode(data);
          pertama= baru;
          terakhir=baru;
        }
        else{
           lisNode baru = new lisNode(data);
           terakhir.setKanan(baru);
           terakhir=baru;
        } 
        
    }
    
    
    public void cetak(){
        lisNode pointer=pertama;
        while(pointer!=null){
            System.out.print("  "+pointer.getData()+"  ");
            pointer=pointer.getKanan();
        }
    }
    public boolean isEmpety(){
        if ((pertama==null)&&(terakhir==null))
            return true;
        else
            return false;
    }
    
}
