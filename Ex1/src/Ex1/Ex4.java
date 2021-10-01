package Ex1;

import java.util.Scanner;

public class Ex4 {
	public static void main (String [] args) {
		
		double a, b, c, d, r, s;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o valor A: ");
		a = leia.nextFloat();
		System.out.println("Entre com o valor B: ");
		b = leia.nextFloat();
		System.out.println("Entre com o valor C: ");
		c = leia.nextFloat();
		
		r = ((a+b) * (a+b));
		s = ((b+c) * (b+c));
		d = (r+s) / 2;
		
		System.out.println("O valor de D é igual a: "+ d);
	}

}
