//정렬. 그런데 배열의 길이가 10밖에 안되어서 그냥 sort 써줌.

package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2693 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(num-- > 0) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[10];
			for(int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			sb.append(arr[7]).append("\n");
		}
		System.out.println(sb.toString());
		
	}
}
