package Ex;

import java.io.PrintStream;
import java.util.*;

public class Ex2 {
	public static void main (String [] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int [] a = new int [6];
		int n, i, impar=0, somapar=0;
		
		for (i = 0; i < 6; i++) {
		System.out.println("\nEntre com um número: ");
		a[i] = leia.nextInt();
		}
		for (i = 0; i < 6; i++) {
			if (a[i] % 2 == 0) {
				somapar += a[i];
				System.out.println("\nPar: "+ a [i]);
			}
			if (a[i] %2 == 0) {
				impar++;
				System.out.println("\nImpar: "+ a [i]);
	}
		}
		System.out.println("\nA soma dos números pares é: "+ somapar);
		System.out.println("\nA quantidade de números impares é: "+ impar);
	}
}
