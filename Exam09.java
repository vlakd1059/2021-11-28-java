import java.util.Scanner;

public class Exam09 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int totalSecond=sc.nextInt();
		int hour = totalSecond/3600;
		int min= (totalSecond%3600)/60;
		int sec= (totalSecond%3600)%60;
		System.out.println(hour+"�� "+min+"�� "+sec+"�� ");
		
		

	}

}
