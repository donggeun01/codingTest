package math1;

import java.util.Scanner;

public class fraction {
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int sum = 0;
		int i = 1;
		while(true) {
			sum += i;
			if(a <= sum) {
				sum -= i; 
				break;
			}
			i++;
		}
		 
		if(i % 2 == 0) {
			int m = a - sum;
			int n = i - (a-sum-1);
			System.out.println(m + "/" + n);
		}
		
		else {
			int m = i - (a-sum-1);
			int n = a - sum;
			System.out.println(m + "/" + n);
		}

	}

}
