
public class Exam12 {

	public static void main(String[] args) {
		// 비교 연산자 - 두 항의 값을 비교하는 연산자
		// 결과같은 언제나 true or false
		// 비교연산자의 기준은 항상 왼쪽이 기준이다.
		System.out.println(8>3);
		System.out.println(3>=3);
		System.out.println(7<9);
		System.out.println(8<=9);
		System.out.println(10==10);
		System.out.println(11!=15);
		
		// 문자열 비교 (문자열이 같은지 비교할때는 equals를 사용한다)
		String name1 ="박건하";
		String name2 ="박건하";
		System.out.println(name1.equals(name2));
		// 논리 연산자(Not, And, Or)
		// And => &&: 둘다 true여야 true, 한쪽이라도 false이면 결과는 false.
		System.out.println(8>7 && 3<2);
		// or  => ||: 한쪽만 true만 나오더라도 true, 둘다 false이면 false.
		System.out.println(8>7 || 3<2);
		// not => !(): 값을 반대로 치환
		System.out.println(!(10<3));
		
	}

}
