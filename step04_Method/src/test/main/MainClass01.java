package test.main;

public class MainClass01 {
// ���� ������ ���۵Ǵ� main �޼ҵ�
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���۵�");
		
		// static member method gura();
		// static 
		MainClass01.gura();
		
		
		System.out.println("main �޼ҵ尡 ���� �˴ϴ�");
	}
// static member method �߰�
	// static�� Ŭ������ .
	public static void gura() {
		System.out.println("gura �޼ҵ尡 ���۵�");
		System.out.println("gura �޼ҵ尡 ���� �˴ϴ�");
	}
}