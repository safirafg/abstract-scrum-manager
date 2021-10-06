package Ex;

import java.util.Scanner;

public class Ex2 {
	public static void main (String [] args) {
		
		int n, par=0, impar=0;
		
		Scanner leia = new Scanner (System.in);
		
		for (int x = 0; x < 10; x++) {
			System.out.println("\nEntre com um número: ");
			n = leia.nextInt();
			
			if (n % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}	
		}
		System.out.printf("\nA quatidade de números pares é de: "+ par);
		System.out.printf("\nA quatidade de números impares é de: "+ impar);
	}
}
