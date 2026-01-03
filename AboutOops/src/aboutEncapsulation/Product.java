package aboutEncapsulation;

public class Product {
	private int price;
	
	
	//setter
	public void setPrice(int price) {
		if(price>=0) {
			this.price=price;
		}
	}
	
	//getter
	public void getPrice() {
		System.out.println("Price is : "+price);
	}
	
	
}
