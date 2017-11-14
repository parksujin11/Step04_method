package test.main;

public class MainClass01 {
// 실행 순서가 시작되는 main 메소드
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됨");
		
		// static member method gura();
		// static 
		MainClass01.gura();
		
		
		System.out.println("main 메소드가 종료 됩니다");
	}
// static member method 추가
	// static은 클래스에 .
	public static void gura() {
		System.out.println("gura 메소드가 시작됨");
		System.out.println("gura 메소드가 종료 됩니다");
	}
}
