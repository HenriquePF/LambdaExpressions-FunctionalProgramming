package entities;

public class ProductImplementsComparable implements Comparable<ProductImplementsComparable>{
	
	private String name;
	private Double price;
	
	public ProductImplementsComparable() {
	}

	public ProductImplementsComparable(String name, Double price) {
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

	//toString generated automatically
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	//Comparison logic: compare a product with another, by name(toUpperCase) then compare to Product p(toUpperCase);
	@Override
	public int compareTo(ProductImplementsComparable p) {
		return name.toUpperCase().compareTo(p.getName().toUpperCase());
	}
	
	
}
