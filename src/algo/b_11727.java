package algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11727 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int dp[] = new int [N+1];
		
		dp[1] = 1;
		for(int i=2; i<N+1; i++) {
			if(i==2) {
				dp[2] = 3;
				continue;
			}
			
			dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
			
		}
		System.out.println(dp[N]);
	}

}
