package com.java.prototypepattern;

public class Demo {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop bs = new BookShop();
	bs.setShopName("Novelty");
	bs.loadData();
	
	//Shallow cloning
	//BookShop bs1 = (BookShop) bs.clone();
  
	BookShop bs1 = bs.clone();	
	bs.getBooks().remove(3);
	bs1.setShopName("A1");
	
	System.out.println(bs);
	System.out.println(bs1);
	
	

}
}
