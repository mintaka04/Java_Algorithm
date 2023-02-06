package divide_and_conquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


//false -> *
public class BOJ_2447 {
	
//	//static boolean[][] arr;
//	static char[][] arr;
//	
//	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int N = Integer.parseInt(br.readLine());
//		//arr = new boolean[N][N];
//		arr = new char[N][N];
//		
//		for(int i = 0; i < N; i++) {
//			Arrays.fill(arr[i], '*');
//		}
//		
//		makeNN(N, 0, 0);
//		
//		for(int i = 0; i < N; i++) {
////			for(int j = 0; j < N; j++) {
////				if(arr[i][j]) sb.append(" ");
////				else sb.append("*");
////			}
//			sb.append(arr[i]);
//			sb.append("\n");
//		}
//		System.out.println(sb);
//		
//	}
//	
//	static void makeNN(int n, int startI, int startJ) {
//		
//		if(n == 1) return;
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				
//				if(i == 1 && j == 1) makeEmpty(n/3, startI + n/3, startJ + n/3);
//				makeNN(n/3, startI + i*(n/3), startJ + j*(n/3));
//				
//			}
//		}
//		
//	}
//	
//	static void makeEmpty(int n, int startI, int startJ) {
//		for(int i = startI; i < startI+n; i++) {
//			for(int j = startJ; j < startJ+n; j++) {
//				//arr[i][j] = true;
//				arr[i][j] = ' ';
//			}
//		}
//	}
	/*
	 * 308ms.. 너무 오래걸림. -> 배열을 char로 고치고 출력시 if문 하나 제외해준것만으로 256ms로 감소
	 * 밑은 다른 사람 코드.
	 */
	
	static int N;
	static char[][] answer;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		answer = new char[N][N];
		
		makeNN(0, 0, N, N);
		for(int i = 0; i < N; i++) {
			sb.append(answer[i]);
			sb.append("\n");
		}
	}
	
	static void makeNN(int x, int y, int size, int val) {
		if(val == 0) {
			for(int i = x; i < x+size; i++) {
				for(int j = y; j < y+size; j++) {
					answer[i][j] = ' ';
				}
			}
		}else if(val == 1) {
			answer[x][y] = '*';
		}else {
			int jump = size/3;
			int num = 0;
			for(int i = x; i < x+size; i+=jump) {
				for(int j = y; j < y+size; j+=jump) {
					num++;
					
					if(num == 5) makeNN(i, j, jump, 0);
					else makeNN(i, j, jump, jump);
				}
			}
		}
	}
}
