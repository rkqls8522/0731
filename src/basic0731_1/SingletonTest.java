package basic0731_1;

public class SingletonTest {
	
	public static void main(String[] args) {
		
//		Singleton s1 = Singleton.getInstance();
		
		CaptionTv c = new CaptionTv();
		Tv t = new Tv();
		CaptionTv c1 = new CaptionTv();
		Tv t1 = new CaptionTv();
		CaptionTv c2 = (CaptionTv)new Tv();
		//�Ϲ���/������(implicit)
		//�����(explicit)
		//upcasting �Ϲ������� �ڵ����� ����ȯ��
		//downcasting�� �ڵ����� ����ȯ�� �Ͼ�� �ʾ� ������(explicit) ����ȯ �ؾ���
		
	}

	
	
	
	
	
}
