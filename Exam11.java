
public class Exam11 {

	public static void main(String[] args) {
		// 증감연산자 : ++, --
		// ++변수, 변수++, --변수, 변수-- ->숫자형 변수만 가능.
		// 증감연산자가 변수 앞에 붙으면 증감을 먼저하고 다른 일처리를 수행한다.
		// 증감연산자가 변수 뒤에 붙으면 다른 일처리를 먼저 수행하고 증감을 한다.
		int num = 10;
		System.out.println(num++);
		System.out.println(num);
	}
}
