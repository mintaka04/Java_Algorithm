package input_output;

import java.io.IOException;

public class baekjoon_1000 {
	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		//int value1 = sc.nextInt();
		//int value2 = sc.nextInt();
		//System.out.println(value1+value2);
		
		byte[] numArray = {0, 0, 0};
		System.in.read(numArray);
		System.out.println(numArray[0] - 48 + numArray[2] - 48);
		//이렇게 배열로 읽어들어야 하는 이유는 system.in이 1byte씩 읽어들이기 때문.
	}
}
