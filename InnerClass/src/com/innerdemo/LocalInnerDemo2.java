package com.innerdemo;

class Mall{
	private String mallName = "Pacific";
	private String loc = "Pune";
	
	void doShopping() {
		
		class Cart{
			String item;
			double price;
			static double bill = 0;
			
			
			public void addItem(String item, double price) {
				
				this.item = item;
				this.price = price;
				System.out.println(this.item+" : "+this.price);
				
				bill +=price;
			}
			
			public void displayBill() {
				System.out.println("----------------------------------");
				System.out.println("Total Bill: "+bill);
				System.out.println("Thank you for shopping at "+mallName+" : "+loc);
			}
			
			
		}
		Cart c1 = new Cart();
		c1.addItem("laptop", 55000);
		c1.addItem("Chocolates", 150);
		c1.addItem("Juice", 389);
		c1.displayBill();
		
	}
}


public class LocalInnerDemo2 {

	public static void main(String[] args) {
		Mall cust1 = new Mall();
		cust1.doShopping();

	}

}
