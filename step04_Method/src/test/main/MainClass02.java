package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//showMsg() �޼ҵ带 ȣ���� ������~
		MainClass02.showMsg("�޼ҵ带 ȣ���� ������");
		
		String str="�ȳ��ϼ���";
		MainClass02.showMsg(str);
		
		//��Ȳ�� ���� null �� �����ϴ� ��쵵 �ִ�.
		//int Ÿ���� null ���� ����.
		MainClass02.showMsg(null);
	}
	
	//static �ɹ� �޼ҵ�
	//static �޼ҵ�� Ŭ������ ���� !!!!!! �޼ҵ��� �̸��� showMsg 
	//void �� ����� �ϰ� ���� �������� �ʴ´ٰ� ����
	//string �� ���ڿ�, �ڹٴ� ������ Ÿ���� �� ����� �Ѵ�. 
	private static void showMsg(String msg) {
		System.out.println("msg:"+msg);
	}
}
