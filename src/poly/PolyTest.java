package poly;

import java.util.ArrayList;
import java.util.List;

public class PolyTest {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer computer = new Computer();
		Audio audio = new Audio();
		
		Product p = new Product();
		List<Product> a1 = new ArrayList<Product>();
//		
//		a1.add(new Tv());
//		a1.add(new Tv());
//
//		a1.add(new Computer());
//		a1.add(new Tv());
//		a1.add(new Tv());
//		
//		a1.add(new Audio());
//		
//		for()
		
//		b.buy(computer);
//		b.buy(tv);
//		b.summary();
		
		IAttachable im = new IAttachable() { //�� �������̽� �̸��� �͸�Ŭ������� �Ѵ�. Ŭ�����̸��� ���� �����̴�.
			
			@Override
			public float sum(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public void driving() {
				// TODO Auto-generated method stub
				
			}
		};
		
		IAttachable im1 = new ImpIAttatchable();
		
	}
}
