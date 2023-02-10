package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ_1181 {
	
	static int N;
	static String[] arr;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new String[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = br.readLine();
		}

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) return o1.compareTo(o2);
				else return o1.length() - o2.length();
			}
			
		});
		
		sb.append(arr[0] + "\n");
		for(int i = 1; i < N; i++) {
			if(!arr[i].equals(arr[i-1])) sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb);
		
		
	}
}
