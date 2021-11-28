import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		// 어떠한 값을 입력하든지 백의자리 아래 값을 버리고 출력하시오.
		// 예) 456 입력-> 결과:400
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 >> ");
		int num =sc.nextInt();
		//int result = num/100 *100; //방법 1
		String result = num/ 100+ "00"; // 방법 2
		System.out.println("결과 : "+ result);
		
		
		

	}

}
