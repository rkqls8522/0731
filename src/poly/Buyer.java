package poly;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends Product{
	
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ� ����
	
	
	//������ ��ǰ�� �����ϴµ� ����� �迭 ������(Vector��ü)
	List<Product> item = new ArrayList<Product>();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money-=p.price; //���� ������ ������ ��ǰ�� ������ ����
		bonusPoint += p.bonusPoint; //��ǰ�� ���ʽ� ������ �߰���
		item.add(p); //������ ��ǰ�� Vector�� �߰���
		System.out.println(p+"�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product p) { //������ ��ǰ�� ȯ����
		if(item.remove(p)) { //������ ��ǰ�� Vector���� ������
			money += p.price; //ȯ�������� �� �߰�
			bonusPoint -= p.bonusPoint; //��ǰ�� ���ʽ� ������ ����
		}else {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
		}
	}
	
	void summary() {
		int sum = 0; //������ ������ ���� �հ�
		String itemList =  ""; //������ ��ǰ ���
		if(item.isEmpty()) { //��ǰ�� ����ִ��� Ȯ��
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return; //�Լ� ����
		}
		
		//�ݺ����� �̿��Ͽ� ������ ��ǰ�� ���ݰ� ����� �����.
		for(int i = 0; i < item.size();i++) {
			Product p = (Product)item.get(i); //Vector�� i��° ������ �����´�.
			sum +=p.price;
			itemList +=(i==0)? ""+p:","+p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " +sum + "���� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		
		
	}
	
	
	
	
}
