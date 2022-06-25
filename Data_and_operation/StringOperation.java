
public class StringOperation {

	public static void main(String[] args) {
		System.out.println("Hello World".length()); // 11
		System.out.println("Hello, My name is [name] ".replace("[name]","Jeongheon")); // Hello My name is Jeongheon
		// replace("a","b") : a -> b
		System.out.println("Hello My name is Jeongheon".toLowerCase()); // hello my name is jeongheon
		// toLowerCase : 소문자 
		System.out.println("Hello My name is Jeongheon".toUpperCase()); // HELLO MY NAME IS JEONGHEON
		// toUpperCase : 대문자
		System.out.println("Hello My name is Jeongheon".substring(4, 10)); // o My n
		// substring(int a, int b) : a부터 b바로전까지 출력 (index는 0부터 시작)
		System.out.println("Hello My name is Jeongheon".substring(10)); // ame is Jeongheon
		// substring(a) : a부터 끝까지 출력
		
	}

}
