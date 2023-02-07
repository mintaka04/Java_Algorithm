package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2751 {
	
	static int N;
	static int[] arr;
	static int[] sorted;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		sorted = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(arr, 0, N-1);
		
		for(int i = 0; i < N; i++) {
			sb.append(arr[i] + "\n");
		}
		
		System.out.println(sb);
		
	}
	
	
	static void merge(int[] a, int start, int mid, int end) {
		int l = start;
		int r = mid + 1;
		int idx = start;
		
		//오른쪽 왼쪽 배열이 다 1개 이상 있을 때
		while(l <= mid && r <= end) {
			//두개 비교해 작은값 sorted에 넣기
			if(a[l] >= a[r]) {
				sorted[idx] = a[r];
				r++;
				idx++;
			}else{
				sorted[idx] = a[l];
				l++;
				idx++;
			}
			
		}
		
		
		//한쪽 배열이 이미 없을 때
		if(l > mid) {
			//왼쪽 배열이 이미 없을 때
			while(r <= end) {
				sorted[idx] = a[r];
				r++;
				idx++;					
			}
		}else{
			//오른쪽 배열이 이미 없을 때
			while(l <= mid) {
				sorted[idx] = a[l];
				l++;
				idx++;					
			}
		}
			
		
		for(int i = start; i <= end; i++) {
			a[i] = sorted[i];
		}
	}
	
	static void mergeSort(int[] arr, int start, int end) {
		
		for(int size = 1; size <= end; size += size) {
			for(int l = 0; l <= end - size; l += 2*size) {
				
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(l + 2*size - 1, end);
				merge(arr, low, mid, high);
				
			}
		}
		
	}
	
}

//916ms
