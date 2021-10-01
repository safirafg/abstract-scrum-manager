package Ex1;

import java.util.Scanner;

public class Ex7 {
	public static void main (String[] args) {
		
		double a, b, c, d, i, f, x, y;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira o coeficiente A: ");
		a = leia.nextFloat();
		System.out.println("\nInsira o coeficiente B: ");
		b = leia.nextFloat();
		System.out.println("\nInsira o coeficiente C: ");
		c = leia.nextFloat();
		System.out.println("\nInsira o coeficiente D: ");
		d = leia.nextFloat();
		System.out.println("\nInsira o coeficiente E: ");
		i = leia.nextFloat();
		System.out.println("\nInsira o coeficiente F: ");
		f = leia.nextFloat();
		
		x = ((c * i) - (b * f) / (a * i) - (b * d));
		y = ((a * f) - (c * d) / (a * i) - (b * d));
		
		System.out.println("\nO valor de X é igual a: "+ x + "e o valor de Y é igual a: "+ y);
		
	}

}
