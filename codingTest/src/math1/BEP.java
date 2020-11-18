// 20-11-04 (break-even point 손익분기점)
package math1;

import java.util.Scanner;

public class BEP {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		c = c - b;
		if(c > 0) {
			System.out.println((a / c)  + 1);
		}
		
		else System.out.println(-1);
		
	}

}
