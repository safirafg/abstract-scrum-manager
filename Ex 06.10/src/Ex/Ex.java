package Ex;

import java.util.*;

public class Ex {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int A [] = {1, 0, 5, -2, -5, 7};
		int soma, n;
		
		soma = A[0] + A[1] + A[5];
		
		System.out.println ("\nA soma entre os valores das posições A[0], A1[1] e A[5] do vetor é: "+ soma);

		A[4] = 100;
		
		for (n=0; n<6; n++) {
			System.out.printf("%d\n", A[n]);
		}
	}

}
