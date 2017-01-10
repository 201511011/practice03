package prob02;

public class Goods {
	String name;
	int price;
	int stock;
	
	Goods(String name, int price, int stock){
		this.name=name;
		this.price=price;
		this.stock=stock;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", stock=" + stock + "]";
	}
	
	
}
