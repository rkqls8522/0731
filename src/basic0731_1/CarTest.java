package basic0731_1;

public class CarTest {

	public static void main(String[] args) {

		InstanceCar a = new InstanceCar(); //�߻� Ŭ������ �ٷ� ��ü ������ �Ұ���
		//��� ���� InstanceCar�� ��ü ����
		a.driving();
		int b = a.sum(5, 7); //������(Overriding/�������̵�)�� �ڽĸ޼��� sum�� �����
		System.out.println(b);
		
		
		
		
		
	}

}
