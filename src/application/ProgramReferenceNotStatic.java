package application;

import java.util.ArrayList;
import java.util.List;

import entities.ProductReferenceNotStatic;


public class ProgramReferenceNotStatic {

	public static void main(String[] args) {

		List<ProductReferenceNotStatic> list = new ArrayList<>();

		list.add(new ProductReferenceNotStatic("Tv", 900.00));
		list.add(new ProductReferenceNotStatic("Mouse", 50.00));
		list.add(new ProductReferenceNotStatic("Tablet", 350.00));
		list.add(new ProductReferenceNotStatic("HD Case", 80.90));

		// Second - Method Static Reference
		list.removeIf(ProductReferenceNotStatic::nonStaticProductPredicate);

		for (ProductReferenceNotStatic p : list) {
			System.out.println(p);

		}
	}
}
