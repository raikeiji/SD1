package Minggu11;

import java.util.NoSuchElementException;

public class StackStatis {

    private int[] element;
    private int front, size;

    public StackStatis(int ukuran) {
        front=-1;
        element=new int[ukuran];
        size=0;
        
    }

    public boolean push(int data) {
        if (size == element.length) {
            return false;
        } else {
            front++;
            element[front] = data;
            size++;
            return true;
        }
    }
    
    public int pop(){
        if (size==0){
            throw new NoSuchElementException();
        }
        else{
            int temp=element[front];
            front--; //diambil
            size--;
            return temp;
        }
    }
    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        if(isEmpty())return"";//sesuaikan dengan pesanmu sendiri
        String hasil="";
        for (int i = 0; i <= front; i++) {
            int j = element[i];
            hasil+=j+" ";
        }
        return hasil;
    }
}
