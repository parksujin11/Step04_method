package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//showMsg() 메소드를 호출해 보세요~
		MainClass02.showMsg("메소드를 호출해 보세요");
		
		String str="안녕하세요";
		MainClass02.showMsg(str);
		
		//상황에 따라 null 을 전달하는 경우도 있다.
		//int 타입은 null 전달 못함.
		MainClass02.showMsg(null);
	}
	
	//static 맴버 메소드
	//static 메소드는 클래스명에 쩜찍어서 !!!!!! 메소드의 이름은 showMsg 
	//void 는 수행다 하고 나서 리턴하지 않는다고 선언
	//string 은 문자열, 자바는 변수에 타입을 꼭 적어야 한다. 
	private static void showMsg(String msg) {
		System.out.println("msg:"+msg);
	}
}
