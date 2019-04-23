package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.ProductPredicate;


public class ProgramPredicate {

	public static void main(String[] args) {

		List<ProductPredicate> list = new ArrayList<>();
		
		list.add(new ProductPredicate("Tv", 900.00));
		list.add(new ProductPredicate("Mouse", 50.00));
		list.add(new ProductPredicate("Tablet", 350.00));
		list.add(new ProductPredicate("HD Case", 80.90));
		
		//First Implementation - Functional Interface
	//	list.removeIf(new ProductPredicateUtil());
		
		
		// Fourth Method - Variable Predicate
	//	Predicate<ProductPredicate> pred = p -> p.getPrice() >= 100.0;
	//	list.removeIf(pred);
		
		//Fith Method - Lambda Expression Inline
		list.removeIf(p -> p.getPrice() >= 100.0);
		
		
		for (ProductPredicate p : list) {
			System.out.println(p);
		}
	}

}
