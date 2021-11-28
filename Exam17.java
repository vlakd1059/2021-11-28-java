import java.util.Scanner;

public class Exam17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("노동시간을 입력하세요 : ");
		int time = sc.nextInt();
//		int mon = time<8? time*5000 : (int)((time-8)*5000*1.5+8*5000); //자료형 변환
//		//int mon = time<8? time*5000 : (time-8)*7500+8*5000; 
//	
//		System.out.println("총 임금은 " + mon+ "원 입니다.");
//		
		if (time<8) {
			int money = time*5000;
			System.out.println("총 노동 임금은 "+money+"원 입니다.");
			
		}
		else {
			int money =(time-8)*7500+8*5000;
			System.out.println("총 노동 임금은 "+money+"원 입니다.");
			
		}
		

	}

}
