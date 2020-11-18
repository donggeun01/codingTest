package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class chairman {

	static int[][] d = new int[15][15];

	public static int dy(int k, int n) {
		
		if(k <= 0) return n;
		if(n <= 0) return n;
	    
        if(d[k][n] != 0) return d[k][n];
        
		return d[k][n] = dy(k, n-1) + dy(k-1, n);
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int[] a = new int[t];
		
		for(int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			a[i] = dy(k, n);
			
		}
		
		for(int i =0; i < t; i++) {
			System.out.println(a[i]);
		}
		

	}

}


