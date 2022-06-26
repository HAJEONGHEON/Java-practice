
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 2;
		System.out.println(b); // 2.0
		// 손실이 발생하지 않았기 때문에 정수를 변수로 지정해도 실수로 출력
		
		// int c =  1.1 로 표현하고싶은 경우
		double d= 1.1;
		int e = (int) 1.1; 
		System.out.println(e); // 1
		// (int) : double -> int의 경우 손실이 발생하기 때문에 명시적으로 형변환을 시행
		
		// int -> String 변환
		String f = Integer.toString(3);
		System.out.println(f); // 3
		// 데이터 타입이 숫자가 아닌 문자열로 변환
		
		System.out.println(f.getClass()); // class java.lang.String
		// 데이터 타입이 무엇인지 확인
	}

}
