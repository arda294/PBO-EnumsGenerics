/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumgeneric;

/**
 *
 * @author ardap
 */
public enum ItemType {
    FOOD(0.15),
    DRINKS(0.10),
    OTHER(0.05);
    
    final private double discount;
    
    ItemType(double discount) {
        this.discount = discount;
    }
    
    public double getDiscount() {
        return this.discount;
    }
}
