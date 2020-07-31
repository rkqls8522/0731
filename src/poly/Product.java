package poly;

public class Product {
	private int price; //��ǰ�� ����
	private int bonusPoint; //��ǰ ���Ž� �����ϴ� ���ʽ� ����
	
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
