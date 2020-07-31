package poly;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends Product{
	
	int money = 1000; //소유금액
	int bonusPoint = 0; //보너스 점수
	
	
	//구입한 제품을 저장하는데 사용할 배열 같은것(Vector객체)
	List<Product> item = new ArrayList<Product>();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money-=p.price; //가진 돈에서 구입한 제품의 가격을 차감
		bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가함
		item.add(p); //구입한 제품을 Vector에 추가함
		System.out.println(p+"를 구입하셨습니다.");
	}
	
	void refund(Product p) { //구매한 제품을 환불함
		if(item.remove(p)) { //구매한 제품을 Vector에서 제거함
			money += p.price; //환불했으니 돈 추가
			bonusPoint -= p.bonusPoint; //제품의 보너스 점수를 차감
		}else {
			System.out.println("구입하신 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0; //구입한 물건의 가격 합계
		String itemList =  ""; //구입한 물품 목록
		if(item.isEmpty()) { //제품이 비어있는지 확인
			System.out.println("구입하신 제품이 없습니다.");
			return; //함수 종료
		}
		
		//반복문을 이용하여 구입한 물품의 가격과 목록을 만든다.
		for(int i = 0; i < item.size();i++) {
			Product p = (Product)item.get(i); //Vector의 i번째 물건을 가져온다.
			sum +=p.price;
			itemList +=(i==0)? ""+p:","+p;
		}
		System.out.println("구입하신 물품의 총금액은 " +sum + "만원 입니다.");
		System.out.println("구입하신 물품은 " + itemList + "입니다.");
		
		
	}
	
	
	
	
}
