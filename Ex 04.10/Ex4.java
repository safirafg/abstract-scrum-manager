package Ex;
import java.util.*;
public class Ex4 {
	public static void main (String [] args) {
		
		int x, x2, par, impar;
		double x1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira um n�mero: ");
		x = leia.nextInt();
		
		x1 = Math.sqrt(x);
		x2 = (x * x);
		
		if (x % 2 == 0) {
			System.out.printf("\nEsse n�mero � PAR e sua raiz quadrada �: %2.2f", x1);
		}
		else if (x % 2 == 1) {
			System.out.println("\nEsse n�mero � IMPAR e elevado ao quadrado � igual a: "+ x2);
		}
	}

}
