package ���ǹ�;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
	  //���� ���߱�
		int answer = 10;
		System.out.print("������ �Է����ּ��� >> ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		
		//���� ����ڰ� 10�� �Է��ߴٸ�
		// "�����Դϴ�." ����� " "���α׷� ����" ���.
		// �ƴҰ�� "���α׷� ����" ���
		if (user==answer) {
			System.out.println("�����Դϴ�.");
			System.out.println("���α׷� ����.");
		}
		else {
			System.out.println("���α׷� ����.");
		}

	}

}
