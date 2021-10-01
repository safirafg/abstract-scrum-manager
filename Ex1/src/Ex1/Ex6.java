package Ex1;

import java.util.Scanner;

public class Ex6 {
	public static void main (String [] args) {
		
		double x1, x2, y1, y2, d, d1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira o ponto X1: ");
		x1 = leia.nextFloat();
		System.out.println("\nInsira o ponto Y1: ");
		y1 = leia.nextFloat();
		System.out.println("\nInsira o ponto X2: ");
		x2 = leia.nextFloat();
		System.out.println("\nInsira o ponto Y2: ");
		y2 = leia.nextFloat();
		
		d = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 -y1));
		d1 = Math.sqrt(d);
		
		System.out.printf("\nA distância entre os pontos é de: %2.2f", (d1));
		
		
	}

}
