package util;

import java.util.function.Predicate;

import entities.ProductPredicate;

public class ProductPredicateUtil implements Predicate<ProductPredicate>{

	/* First Implementation - Functional Interface
	 * 
	 * This is an example of functional interface
	 * because it only has one abstract method
	 * to be implemented.
	 */
	
	@Override
	public boolean test(ProductPredicate p) {
		return p.getPrice() >= 100.0;
	}
}
