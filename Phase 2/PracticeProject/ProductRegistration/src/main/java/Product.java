

public class Product {
	private int id;
	private String name;
	private String brand;
	
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + "]";
	}
	public Product() {
		super();
	}
	public Product(int id, String name, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getbrand() {
		return brand;
	}
	public void setbrand(String brand) {
		this.brand = brand;
	}
}