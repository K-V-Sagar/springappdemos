package com.samples.S01SpringCoreDI;

public class Item {
	private int ID;
	private String Name;
	private double Price;
	private int Quantity;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		ID = ID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [ID=" + ID + ", Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity + "]";
	}
	
	

}