
public class Exam02_0111 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		// 문제 : a와 b의 값을 서로 바꾸어 주세요.
		// 치환 : 두 개의 변수의 값을 바꾼다!
		
		int temp = a;
		
		a = b;
		b = temp;
			
		System.out.println("a의 값 : " +a);
		System.out.println("b의 값 : " +b);
	
	}

}
