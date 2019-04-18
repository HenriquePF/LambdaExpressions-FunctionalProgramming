package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 2000.00));
		list.add(new Product("Tablet", 500.00));
			
		/*
		//arrow function- parameters(p1 p2)  arrow
		Comparator<Product> comp = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());   <- Verbose way 
		};
		*/
		
		//Arrow function:
		//Parameters(p1 p2) and arrow		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		//Less verbose version of the comparator method
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
