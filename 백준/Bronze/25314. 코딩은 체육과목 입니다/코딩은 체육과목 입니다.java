import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
public static void main(String[] args) throws IOException {
	// BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 선언
	
	int X = Integer.parseInt(br.readLine()); // readLine()으로 받은 입력 데이터 Strinzg임.
	int n = X / 4;
	
	for (int i = 1; i < n+1; i++) {
		System.out.print("long ");
	}
	System.out.print("int");


	}
}