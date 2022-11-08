/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumgeneric;

/**
 *
 * @author ardap
 */
public class EnumGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item("Chicken Teriyaki", ItemType.FOOD, 35000);
        Item i2 = new Item("Vanilla Milkshake", ItemType.DRINKS, 14500);
        
        System.out.println(i1 + " Discount : " + i1.getDiscount());
        System.out.println(i2 + " Discount : " + i2.getDiscount());
    }
    
}
