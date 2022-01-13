
public class Exam03_0111 {

	public static void main(String[] args) {
		int num1 = 10;
		//System.out.println(++num1);
		// ++num1 --> num1에 1을 더한 다음에 출력을 시켜라
		System.out.println(num1++);
		// num1++ --> 출력이 된 뒤에 num1에 1을 더하라 (후위연산)
		//num1 = num1+1;
		
		int hap = 0, j = 0, k = 0, L = 0;
		hap = ++j + k++ + ++L;
		System.out.println(hap + "," + j + "," + k + "," + L);
	}

}
