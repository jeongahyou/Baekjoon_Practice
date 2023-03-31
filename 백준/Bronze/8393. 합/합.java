import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {
	// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	
	int N = Integer.parseInt(br.readLine()); // readLine()으로 받은 입력 데이터 String임.

	int sum = 0;
	for (int i = 1; i < N+1; i++) {
		sum += i;
	}

	System.out.println(sum);

	}
}
