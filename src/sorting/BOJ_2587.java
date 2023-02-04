package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2587 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int avg = 0;
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			avg += arr[i];
		}
		
		sb.append(avg/5 + "\n");
		
		for(int i = 0; i < 5; i++) {
			int min = i;
			
			for(int j = i+1; j < 5; j++) {
				if(arr[min] > arr[j]) min = j;
			}
			
			swap(arr, i, min);
		}
		
		sb.append(arr[2]);
		System.out.println(sb);
		
		
	}
	
	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
//선택정렬 써보기!
