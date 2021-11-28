package 조건문;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오 : ");
		int age = sc.nextInt();
		if(age<10) {
			System.out.println("10대 미만입니다.");
		}
		else if(age>=10&& age<20) {
			System.out.println("10대입니다.");
		}
		else if(age>=20&& age<30) {
			System.out.println("20대입니다.");
		}
		else if(age>=30&& age<40) {
			System.out.println("30대입니다.");
		}
		else {
			System.out.println("40대 이상입니다.");
		}

	}

}
