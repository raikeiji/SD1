/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu8;

/**
 *
 * @author admin
 */
public class linkList {
    private ListNode pertama;
    private ListNode terakhir;
//    private String nama;
    

    public linkList() {
        pertama=null;
        terakhir=null;
    }
    
    public void addPertama(int data){
        if(isEmpty()){
            ListNode baru=new ListNode(data);
            pertama=baru;
            terakhir=baru;
        }
        else {
            ListNode baru=new ListNode(data);
            baru.setkanan(pertama);
            pertama=baru;
        }
    }
    
    public void addterakhir(int data){
     if(isEmpty()){
            ListNode baru=new ListNode(data);
            pertama=baru;
            terakhir=baru;
            
        }
        else{
            ListNode baru=new ListNode(data);
            terakhir.setkanan(baru);
            terakhir=baru;
        }
    }
    
//    @Override
//    public String toString(){
//        String isi=" ";
//        if (!isEmpty()){
//            ListNode pointer=pertama;
//            while(pointer!=null){
//                isi=isi+pointer.getData()+" ";
//                pointer=pointer.getkanan();
//            }
//        }
//        return isi;
//    }
//    
    public void cetak(){
        ListNode pointer=pertama;
        while(pointer!=null){
            System.out.println(" "+pointer.getData()+" ");
            pointer=pointer.getkanan();
        }
    }
//    public ListNode removePertama(ListNode bantu){
//        if(pertama!=null){
//            if (!isEmpty()){
//                bantu=pertama;
//                pertama=pertama.getkanan();
//                return bantu;
//            }
//        }
//        else
//        {
//            return null;
//        } 
//        return null;
//    }
//    
//    public ListNode removeTerakhir(ListNode bantu){
//        if(pertama!=null){
//            if (!isEmpty()){
//                bantu=pertama;
//                while(bantu.getkanan()!=terakhir){
//                    bantu=bantu.getkanan();
//                }
//                terakhir=bantu;
//                bantu=bantu.getkanan(); 
//                terakhir.setkanan(null);
//                return bantu;
//            }
//        }
//        else {
//            return null;
//        }
//        return null;
//    }
//    
//    public ListNode removerlast(ListNode bantu){
//        if (pertama==terakhir){
//            bantu=pertama;
//            terakhir=pertama=null;
//            
//        }
//        return bantu;
//    }
//    
    public boolean isEmpty(){
        if((pertama==null)&&(terakhir==null)){
            return true;
        }
        else{
            return false;
        }
    }
}
