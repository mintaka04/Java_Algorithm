package io_and_cal;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStream_InputStreamReader {
	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
//		System.out.println("is : " + (char)is.read());
		//1 -> 49
		//12 -> 49
		//a -> 97    | (char)is.read() -> a
		//ab -> 97    | (char)is.read() -> a

//		byte[] b = new byte[2];
//		is.read(b);
//		for(byte val : b) {
//			System.out.println(val);			
//		}
		
		
/////////////////////////////////////////////		
		
		InputStreamReader ir = new InputStreamReader(System.in);
//		System.out.println("ir : " + (char)ir.read());
		
		//1 -> 49
		//12 -> 49
		//a -> 97   | (char)is.read() -> a
		//ab -> 97   | (char)is.read() -> a


		
		char[] c = new char[2];
		ir.read(c);
		for(char val : c) {
			System.out.println(val);			
		}
		
		
	}
}
