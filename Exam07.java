import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// ��� ���� �Է��ϵ��� �����ڸ� �Ʒ� ���� ������ ����Ͻÿ�.
		// ��) 456 �Է�-> ���:400
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� >> ");
		int num =sc.nextInt();
		//int result = num/100 *100; //��� 1
		String result = num/ 100+ "00"; // ��� 2
		System.out.println("��� : "+ result);
		
		
		

	}

}
