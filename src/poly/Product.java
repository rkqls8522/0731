package poly;

public class Product {
	int price; //��ǰ�� ����
	int bonusPoint; //��ǰ ���Ž� �����ϴ� ���ʽ� ����
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	

	Product(){
		price = 0;
		bonusPoint = 0;
	}
	
	
	
}
