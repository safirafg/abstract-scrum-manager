package Ex;
import java.util.*;
public class Ex4 {
	public static void main (String [] args) {
		
		int x, x2, par, impar;
		double x1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira um número: ");
		x = leia.nextInt();
		
		x1 = Math.sqrt(x);
		x2 = (x * x);
		
		if (x % 2 == 0) {
			System.out.printf("\nEsse número é PAR e sua raiz quadrada é: %2.2f", x1);
		}
		else if (x % 2 == 1) {
			System.out.println("\nEsse número é IMPAR e elevado ao quadrado é igual a: "+ x2);
		}
	}

}
