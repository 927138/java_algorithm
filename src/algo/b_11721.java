package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11721 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		for(int i=1; i<=str.length(); i++) {
			sb.append(str.charAt(i-1));
			
			if(i % 10 == 0) sb.append("\n");
		}
		System.out.println(sb);
	}
	
}
