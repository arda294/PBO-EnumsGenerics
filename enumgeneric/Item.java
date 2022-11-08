/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumgeneric;

/**
 *
 * @author ardap
 */
public class Item {
    private String name;
    private ItemType type;
    private double price;
    
    Item(String name, ItemType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    
    public <T extends Number> void setPrice(T newPrice) {this.price = (double)newPrice;}
    
    public double getPrice() {return this.price;}
    
    public void setName(String newName) {this.name = newName;}
    
    public String getName() {return this.name;}
    
    public double getDiscount() {return this.type.getDiscount();}
    
    @Override
    public String toString() {
        return this.name + " " + this.type + " " + this.price;
    }
}
