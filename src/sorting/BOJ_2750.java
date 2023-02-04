package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i < N; i++) {
			int target = arr[i];
			int j = i - 1;
			
			while(j >= 0 && target < arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = target;
		}
		
		
		for(int i = 0; i < N; i++) {
			sb.append(arr[i]+"\n");
		}
		
		System.out.println(sb);
		
		
	}
}

//삽입 정렬