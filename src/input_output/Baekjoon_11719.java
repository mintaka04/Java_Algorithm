package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_11719 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String s;
		
		while( (s=br.readLine()) != null) {
			sb.append(s).append("\n");
		}
		System.out.println(sb.toString());
	}
}

//11718번과의 차이는 빈줄이 주어질 때도 있고,
//공백으로 시작하거나 끝날때도 있다는 것.
//하지만 11718번 코드에서 이미 조건을 만족시킨채로 작성했기 때문에
//여기도 동일히 작성.