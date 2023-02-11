package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_24060 {
	
	static int[] arr;
	static int[] sorted;
	static int cnt = 0;
	static int K;
	static int result = -1;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		sorted = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println(result);
		
		
		
	}
	
	static void merge(int[] a, int start, int mid, int end) {
		int l = start;
		int r = mid+1;
		int idx = start;
		
		while(l <= mid && r <= end) {
			if(a[l] < a[r]) {
				sorted[idx] = a[l];
				l++;
				idx++;
			}else {
				sorted[idx] = a[r];
				r++;
				idx++;
			}
		}
		
		if(l > mid) {
			while(r<=end) {
				sorted[idx] = a[r];
				r++;
				idx++;
			}
		}else {
			while(l <= mid) {
				sorted[idx] = a[l];
				l++;
				idx++;
			}
		}
		
		for(int i = start; i <= end; i++) {
			a[i] = sorted[i];
			cnt++;
			if(cnt == K) {
				result = a[i];
			}
		}
	}
	
	static void mergeSort(int[] a, int start, int end) {
		if(start < end) {
			int mid = (start + end)/2;
			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);
			merge(a, start, mid, end);
		}
	}
}
