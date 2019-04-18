package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.ProductImplementsComparable;

public class ProgramImplementsComparable {

	public static void main(String[] args) {

		List<ProductImplementsComparable> list = new ArrayList<>();
		
		list.add(new ProductImplementsComparable("TV", 900.00));
		list.add(new ProductImplementsComparable("Smartphone", 2000.00));
		list.add(new ProductImplementsComparable("Xbox", 500.00));
		
		//To use sort(), the method needs the class Product be an implementation of Comparable
		Collections.sort(list);
		
		for(ProductImplementsComparable p : list) {
			System.out.println(p);
		}
		
	}

}
