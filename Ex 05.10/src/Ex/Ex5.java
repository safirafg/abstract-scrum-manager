package Ex;

import java.util.*;

public class Ex5 {
	public static void main (String [] args) {
		
		int x=0, soma=0;
		
		Scanner leia = new Scanner (System.in);
		
		
		do  {
			System.out.println("\nEntre com um n�mero: ");
			x = leia.nextInt();
			
			if (x >= 1) {
				soma += x;
			}						
		}
		
		while (x != 0);
			System.out.printf("\nA soma � igual a: %d",soma);
			
	}}
	

