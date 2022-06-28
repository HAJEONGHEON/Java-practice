import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
	
	public static void main(String[] args) throws FileNotFoundException { 
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		// result1.txt라는 파일에 쓰기가 가능한 PrintWriter클래스를 이용해 p1이라는 변수로 만듬
		p1.write("Hi");
		p1.close();
	}
	
	
}