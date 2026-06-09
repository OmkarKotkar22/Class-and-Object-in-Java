/*we want to create class name as Product with field id,name and price and store 5 product details in it and display it*/

import java.util.*;
class Product{
	private static int Id = 1;
	private int id;
	private String name;
	private int price;

	Product(String name, int price){
		this.id = Id++;
		this.name = name;
		this.price = price;
	}	
	
	public void display(){
		System.out.println(id + "\t" + name + "\t" + price);
	}
}


public class 5ProductsArray_of_Object{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many records you want to add: ");
		int n = sc.nextInt();

		Product p[] = new Product[n];
		
		for(int i = 0; i < n; i++){
			System.out.println("Enter the Product Details: "+ (i+1));
			System.out.println("Enter the Product Name: ");
			String name = sc.next();

			System.out.print("Enter the Product Price: ");
			int price = sc.nextInt();

			p[i] = new Product(name, price);
		}

		System.out.println("Display Detials: ");
		for(Product prod : p){
			prod.display();
		}
	}
}