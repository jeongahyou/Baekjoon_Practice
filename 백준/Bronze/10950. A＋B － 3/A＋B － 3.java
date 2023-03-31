import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
	// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	
	int N = Integer.parseInt(br.readLine()); // readLine()으로 받은 입력 데이터 String임.

	StringTokenizer st; // 문자열을 구분 문자로 자르고 싶을 때 사용하는 클래스
	StringBuilder sb = new StringBuilder(); // StringBuilder 클래스의 인스턴스는 그 값을 변경할 수 있고, 추가할 수 있는 가변객체(mutable) 
	
	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(br.readLine(), " "); // 띄어쓰기로 분리
		sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())); // append는 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 마지막에 추가
		sb.append('\n');
		
	}

	System.out.println(sb);

	}
}