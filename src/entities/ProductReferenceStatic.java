package entities;

public class ProductReferenceStatic {
	
	private String name;
	private Double price;
	
	public ProductReferenceStatic() {
	}

	public ProductReferenceStatic(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	//Second - Method Static Reference
	public static boolean staticProductPredicate(ProductReferenceStatic p) {
		return p.getPrice() >= 100.0;
	}

	//toString generated automatically
	@Override
	public String toString() {
		return "Product [Name= " + name + ", price= " + price + "]";
	}	
}
