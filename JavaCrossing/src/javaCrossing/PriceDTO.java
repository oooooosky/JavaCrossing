package javaCrossing;

public class PriceDTO {

	private int price;
	private int day;
	private int total;
	private int fruitTotal;
	
	public PriceDTO() {
		
	}
	
	public PriceDTO(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getFruitTotal() {
		return fruitTotal;
	}

	public void setFruitTotal(int fruitTotal) {
		this.fruitTotal = fruitTotal;
	}

	@Override
	public String toString() {
		return "PriceDTO [price=" + price + ", day=" + day + "]";
	}
	
}
