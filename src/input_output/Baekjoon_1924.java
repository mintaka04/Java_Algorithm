package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1924 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int month = Integer.parseInt(st.nextToken());
		int totalDate = Integer.parseInt(st.nextToken());
		
//		for(int i = 1; i < month; i++) {
//			
//			if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
//				totalDate += 31;
//			}else if(i == 4 || i == 6 || i == 9 || i == 11) {
//				totalDate += 30;
//			}else if(i == 2){
//				totalDate += 28;
//			}
//		}
//////////////////		
		//위의 주석대로 하는 것보다 이 방법이 더 연산이 적음.
		int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < month-1; i++) {
			totalDate += monthDay[i];
		}
		
		
////////////////
		int day = totalDate%7;
		
		if(day == 0) {
			System.out.println("SUN");
		}else if(day == 1) {
			System.out.println("MON");
		}else if(day == 2) {
			System.out.println("TUE");
		}else if(day == 3) {
			System.out.println("WED");
		}else if(day == 4) {
			System.out.println("THU");
		}else if(day == 5) {
			System.out.println("FRI");
		}else if(day == 6) {
			System.out.println("SAT");
		}
		
	}
}
