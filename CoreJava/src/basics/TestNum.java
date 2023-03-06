package basics;
enum Laptops{
	Dell(100),Lenova(200),Samsung(300),Apple(500),Asus(400),Hp;//Objects of enum Class Laptops
	private int price;
	private Laptops(int i) {
		this.price=i;
	}
	private Laptops() {
		this.price=50;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class TestNum {

	public static void main(String[] args) {
		 
		
		for(Laptops lap:Laptops.values()) {
			if(lap==Laptops.Dell ) {
				lap.setPrice(20);
				System.out.println(lap +" : "+lap.getPrice() +"------------ Price changed ");
			}
			else {
				System.out.println(lap+" : "+lap.getPrice());	
			}
			
		}

	}

}
