import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int time = sc.nextInt();
//		int mon = time<8? time*5000 : (int)((time-8)*5000*1.5+8*5000); //�ڷ��� ��ȯ
//		//int mon = time<8? time*5000 : (time-8)*7500+8*5000; 
//	
//		System.out.println("�� �ӱ��� " + mon+ "�� �Դϴ�.");
//		
		if (time<8) {
			int money = time*5000;
			System.out.println("�� �뵿 �ӱ��� "+money+"�� �Դϴ�.");
			
		}
		else {
			int money =(time-8)*7500+8*5000;
			System.out.println("�� �뵿 �ӱ��� "+money+"�� �Դϴ�.");
			
		}
		

	}

}
