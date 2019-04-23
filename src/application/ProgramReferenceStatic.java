package application;

import java.util.ArrayList;
import java.util.List;

import entities.ProductReferenceStatic;



public class ProgramReferenceStatic {

	public static void main(String[] args) {
		
		List<ProductReferenceStatic> list = new ArrayList<>();
		
		list.add(new ProductReferenceStatic("Tv", 900.00));
		list.add(new ProductReferenceStatic("Mouse", 50.00));
		list.add(new ProductReferenceStatic("Tablet", 350.00));
		list.add(new ProductReferenceStatic("HD Case", 80.90));
			
		// Second - Method Static Reference
		list.removeIf(ProductReferenceStatic::staticProductPredicate);
	
		
		for(ProductReferenceStatic p : list) {
			System.out.println(p);

		}
	}
}
