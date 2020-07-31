package poly;

public class Product {
	private int price; //제품의 가격
	private int bonusPoint; //제품 구매시 제공하는 보너스 점수
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	

	Product(){
		price = 0;
		bonusPoint = 0;
	}
	
	void setPrice(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10);
	}
	
	int getPrice() {
		return this.price;
	}
	int getBonusPoint() {
		return this.bonusPoint;
	}
}
