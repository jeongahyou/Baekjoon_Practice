import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	
	
	if (A != B && B != C && A != C) {
		int max;
		// 만약 A > B면 
		if (A > B) {
			// C > A > B라면
			if (C > A) {
				max = C;
			}
			// A > (B,C)
			else {
				max = A;
			}
		}
		// B> A라면
		else {
			// C > B > A라면
			if (C > B) {
				max = C;
			}
			// B > (A,C)
			else {
				max = B;
			}
		} 
		System.out.println(max * 100);
	}
	
	else { 
		if (A == B && B == C) {
			System.out.println(10000 + A * 1000);
		}
		else {
			// A가 B 혹은 C랑만 같은 경우
			if(A == B || A == C) {
				System.out.println(1000 + A * 100);
			}
			// B가 C랑 같은 경우
			else {
				System.out.println(1000 + B * 100);
			}
		}

	}

	}
}