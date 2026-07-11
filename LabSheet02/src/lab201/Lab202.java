package lab201;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab202 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int[] initial_numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		Scanner sc = new Scanner(System.in);
		
		for (int n: initial_numbers) {
			numbers.add(n);
		}
		
		System.out.print("เพิ่มเลขต่อท้าย: ");
		int a = sc.nextInt();
		numbers.add(a);
		
		System.out.print("เลขที่จะแทรก: ");
		int b = sc.nextInt();
		numbers.add(9, b);
		
		numbers.remove(1);
		
		numbers.set(2, 9);
		
		System.out.println(numbers);
		
		
		
	}
	
}
