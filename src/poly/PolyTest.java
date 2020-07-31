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
		
		IAttachable im = new IAttachable() { //이 인터페이스 이름은 익명클래스라고도 한다. 클래스이름이 없기 때문이다.
			
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
