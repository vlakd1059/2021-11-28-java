import java.util.Scanner;

public class Exam16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int num1 =sc.nextInt();
		
		System.out.print("�ʿ��� ������ �� : ");
		System.out.println( num1%5==0 ?  num1/5 : num1/5+1);
	

	}

}
