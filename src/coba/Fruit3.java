/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coba;

/**
 *
 * @author admin
 */
// Sort an Object with Comparable
public class Fruit3 {
    private String fruitName;
    private String fruitDesc;
    private int quantity;

    public Fruit3(String fruitName, String fruitDesc, int quantity) {
        this.fruitName = fruitName;
        this.fruitDesc = fruitDesc;
        this.quantity = quantity;
    }

    public String getFruitDesc() {
        return fruitDesc;
    }

    public void setFruitDesc(String fruitDesc) {
        this.fruitDesc = fruitDesc;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
