package test.main;
//다른 패키지에 있는 클래스는 import 해야 사용할 수 있다. 
import test.mypac.YourUtill;

public class MainClass06 {
	public static void main(String[] args) {
		// 메세지를 전송해 보세요.
		MyUtill.sendMessage();
		// 화면을 캡쳐해 보세요.
		MyUtill.screenCapture();

		// 파일을 다운로드해 보세요.
		YourUtill.fileDown();
		// 파일을 업로드 해보세요.
		YourUtill.fileUp();
		
	}
}
