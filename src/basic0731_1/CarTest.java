package basic0731_1;

public class CarTest {

	public static void main(String[] args) {

		InstanceCar a = new InstanceCar(); //추상 클래스로 바로 객체 생성이 불가능
		//상속 받은 InstanceCar로 객체 생성
		a.driving();
		int b = a.sum(5, 7); //재정의(Overriding/오버라이딩)된 자식메서드 sum이 실행됨
		System.out.println(b);
		
		
		
		
		
	}

}
