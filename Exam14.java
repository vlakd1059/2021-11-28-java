import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int num= sc.nextInt();
		System.out.println(num%2==0 ? "짝수":"홀수");

	}

}
