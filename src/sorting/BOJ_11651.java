package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11651 {
	
	static int N;
	static int[][] arr;
	static int[][] sorted;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new int[N][2];
		sorted = new int[N][2];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int xy = 0;
		mergeSort(arr, 0, N-1, xy);
		xy = 1;
		mergeSort(arr, 0, N-1, xy);
		
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		
		System.out.println(sb);
		
	}
	
	
	static void merge(int[][] a, int start, int mid, int end, int xy) {
		
		int l = start;
		int r = mid + 1;
		int idx = start;
		
		while(l <= mid && r <= end) {
			if(a[l][xy] <= a[r][xy]) {
				sorted[idx][xy] = a[l][xy];
				sorted[idx][1-xy] = a[l][1-xy];
				idx++;
				l++;
			}else {
				sorted[idx][xy] = a[r][xy];
				sorted[idx][1-xy] = a[r][1-xy];
				idx++;
				r++;
			}
		}
		
		if(l > mid) {
			while(r <= end) {
				sorted[idx][xy] = a[r][xy];
				sorted[idx][1-xy] = a[r][1-xy];
				idx++;
				r++;
			}
		}else {
			while(l <= mid) {
				sorted[idx][xy] = a[l][xy];
				sorted[idx][1-xy] = a[l][1-xy];
				idx++;
				l++;
			}
		}
		
		for(int i = start; i <= end; i++) {
			a[i][0] = sorted[i][0];
			a[i][1] = sorted[i][1];
		}
		
	}
	
	static void mergeSort(int[][] a, int start, int end, int xy) {
		for(int size = 1; size <= end; size += size) {
			for(int l = 0; l <= end - size; l += 2*size) {
				int low = l;
				int mid = l + size - 1;
				int high = Math.min(end, l + 2*size - 1);
				merge(a, l, mid, high, xy);
			}
		}
	}
	
}