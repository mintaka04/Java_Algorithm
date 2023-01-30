package implementation;

import java.io.IOException;

public class BOJ_11654 {
	public static void main(String[] args) throws IOException {
		
		int a = System.in.read();
		System.out.println(a);
	}
}

/*
 * 읽기
 * --1byte
 * 		System.in.read()  -> 1byte 읽어 아스키코드로 나타냄 (예외처리 필요)
 * 							-> InputStream의 객체!
 * 
 * --2byte (=char)
 * 		InputStreamReader -> 2byte 읽어옴.
 * 
 * inputstream과 inputstreamreader의 유의미한 차이?는 한글 입력 유무인듯.
 * inputstream의 경우 char로 형변환 해줘도 이미 1byte만 받았기 때문에 한글 변형 안됨.
 */