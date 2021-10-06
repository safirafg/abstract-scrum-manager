package Ex;

import java.util.*;

public class Ex6 {
	public static void main (String [] args) {
		
		int x=0, media=0, soma=0, cont=0;
		
		Scanner leia = new Scanner (System.in);
		
		do {
			System.out.println ("\nEntre com um número: ");
			x = leia.nextInt();
			
			if (x % 3 == 0 && x != 0) {
				soma += x;
				cont++;
			}
			
		}
		while (x != 0);
		media = soma / cont;
		System.out.printf ("\nA média ée igual a: %d", media);
	}

}
