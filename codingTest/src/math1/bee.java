package math1;

import java.util.Scanner;

public class bee {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int answer = 1, num = 1;
		int bee = scan.nextInt();
		int count = 6;
		
		while(true) {
			if (bee == 1) {
				System.out.println(1);
				break;
			}
			num += count;
			answer++;
			if(bee <= num) {
				System.out.println(answer);
				break;
			}
			count += 6;
		}

	}

}
