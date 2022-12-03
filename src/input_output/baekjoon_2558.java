package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2558 {
	public static void main(String[] args) throws IOException {
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		System.out.println(num1+num2);
		
//		int a = System.in.read();
//		int b = System.in.read();
//		int c = System.in.read();
//		System.out.println("a : " + a);
//		System.out.println("b : " + b);
//		System.out.println("c : " + c);
//		System.out.println(a - 48 + c - 48);
		//백준에서는 되는데 여기서는 안됨...
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		System.out.println(a+b);
		
		br.close();
	}
}
