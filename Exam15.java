import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		System.out.println(num1>num2 ? "�� ���� �� :"+ (num1-num2) :"�� ���� �� :"+ (num2-num1));
	
	}

}