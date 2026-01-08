package encapsulationPractice;

public class LibraryBook {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	void updateBookPrice(double price) {
		if(price>0)
			setPrice(price);
	}
	void displayBookPrice() {
		System.out.println("Price of the book is : "+getPrice());	}
}
