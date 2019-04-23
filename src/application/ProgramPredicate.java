package application;

import java.util.ArrayList;
import java.util.List;
import entities.ProductPredicate;
import util.ProductPredicateUtil;

public class ProgramPredicate {

	public static void main(String[] args) {

		List<ProductPredicate> list = new ArrayList<>();
		
		list.add(new ProductPredicate("Tv", 900.00));
		list.add(new ProductPredicate("Mouse", 50.00));
		list.add(new ProductPredicate("Tablet", 350.00));
		list.add(new ProductPredicate("HD Case", 80.90));
		
		list.removeIf(new ProductPredicateUtil());
		
		for (ProductPredicate p : list) {
			System.out.println(p);
		}
	}

}
