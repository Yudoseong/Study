
public class Exam03_0111 {

	public static void main(String[] args) {
		int num1 = 10;
		//System.out.println(++num1);
		// ++num1 --> num1�� 1�� ���� ������ ����� ���Ѷ�
		System.out.println(num1++);
		// num1++ --> ����� �� �ڿ� num1�� 1�� ���϶� (��������)
		//num1 = num1+1;
		
		int hap = 0, j = 0, k = 0, L = 0;
		hap = ++j + k++ + ++L;
		System.out.println(hap + "," + j + "," + k + "," + L);
	}

}
