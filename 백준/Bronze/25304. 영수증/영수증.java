import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
public static void main(String[] args) throws IOException {
	// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	
	int X = Integer.parseInt(br.readLine()); // readLine()으로 받은 입력 데이터 Strinzg임.
	int N = Integer.parseInt(br.readLine()); // readLine()으로 받은 입력 데이터 Strinzg임.

	int mysum = 0;
	
	StringTokenizer st;
	
	for (int i = 0; i < N; i++) {
		st = new StringTokenizer(br.readLine(), " ");
		mysum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
	}
	
	if (X == mysum) {
		System.out.println("Yes");
	} else {
		System.out.println("No");
	}

	}
}
