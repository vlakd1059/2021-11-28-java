
public class Exam12 {

	public static void main(String[] args) {
		// �� ������ - �� ���� ���� ���ϴ� ������
		// ������� ������ true or false
		// �񱳿������� ������ �׻� ������ �����̴�.
		System.out.println(8>3);
		System.out.println(3>=3);
		System.out.println(7<9);
		System.out.println(8<=9);
		System.out.println(10==10);
		System.out.println(11!=15);
		
		// ���ڿ� �� (���ڿ��� ������ ���Ҷ��� equals�� ����Ѵ�)
		String name1 ="�ڰ���";
		String name2 ="�ڰ���";
		System.out.println(name1.equals(name2));
		// �� ������(Not, And, Or)
		// And => &&: �Ѵ� true���� true, �����̶� false�̸� ����� false.
		System.out.println(8>7 && 3<2);
		// or  => ||: ���ʸ� true�� �������� true, �Ѵ� false�̸� false.
		System.out.println(8>7 || 3<2);
		// not => !(): ���� �ݴ�� ġȯ
		System.out.println(!(10<3));
		
	}

}
