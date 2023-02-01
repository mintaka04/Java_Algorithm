package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
	
	static int[] alpha = new int[26];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c >= 'a') {
				//소문자
				alpha[c - 'a']++;
			}else {
				//대문자
				alpha[c-'A']++;
			}
		}
		
		int max = 0;
		int index = 0;
		int repeatNum = 0;
		for(int i = 0; i < alpha.length; i++) {
			if(alpha[i] > max) {
				index = i;
				max = alpha[i];
				repeatNum = 0;
			}else if(alpha[i] == max && alpha[i] != 0) {
				repeatNum++;
			}
		}
		
		if(repeatNum > 0) System.out.println("?");
		else System.out.println((char)('A'+index));
	}
}

//다른분
//static final byte A64 = (byte)64;
//
//public static void main(String[] args) throws IOException{
//    InputStream is = System.in;
//    byte[] buf = new byte[1000003];
//    is.read(buf);
//    
//    int[] cnt = new int[27];
//    
//    for(int i=0; buf[i]>A64; i++) cnt[buf[i]&31]++;
//    
//    int max_idx = 0, same_idx = 0;
//    for(int i=1; i<27;i++){
//        if(cnt[max_idx]<cnt[i]) max_idx = i;
//        else if(cnt[max_idx]==cnt[i]) same_idx = i;
//    }
//    if(cnt[max_idx]==cnt[same_idx]) System.out.print('?');
//    else System.out.print((char)(max_idx+64));
//}


//public class Main {
//	public static void main(String args[]) throws IOException {
//		int tmp;
//		int[] data = new int[58]; 
//		while((tmp = System.in.read()- (int)'A')>-1) {
//			if(tmp>31)
//				tmp = tmp-32;
//			data[tmp]++;
//		}
//		
//		tmp = 0;
//		for(int i=1; i<58; i++) {
//			if(data[tmp]<data[i]) {
//				tmp = i;
//			}
//		}
//		
//		for(int i=0; i<58; i++) {
//			if(data[tmp] == data[i] && i!=tmp) {
//				System.out.println("?");
//				return;
//			}
//		}
//		System.out.println((char)(tmp+'A'));
//	}
//}

