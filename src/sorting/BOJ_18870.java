package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_18870 {
	
	static int N;
	static int[] arr;
	static int[] sorted;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		arr = new int[N];
		sorted = new int[N];
		
		for(int i = 0; i < N; i++) {
			sorted[i] = arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		int rank = 0;
		for(int i = 0; i < N; i++) {
			if(!hm.containsKey(sorted[i])) {
				hm.put(sorted[i], rank);
				rank++;
			}
		}
		
		for(int i = 0; i < N; i++) {
			sb.append(hm.get(arr[i]) + " ");
		}
		
		System.out.println(sb);
		
	}
}
