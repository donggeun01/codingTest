package math1;

import java.util.Scanner;

public class sugarDeliver {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int a = s.nextInt();
		while(true) {
			if(a % 5 == 0) {
				sum = sum + (a / 5);
				System.out.println(sum);
				break;
			}
			else if(a <= 2) {
				System.out.println(-1); 
				break;
			}
			a -= 3;
			sum++;
		}
			
	}

}
