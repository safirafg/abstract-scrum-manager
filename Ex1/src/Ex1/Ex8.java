package Ex1;

import java.util.Scanner;

public class Ex8 {
	public static void main (String[] args) {
		
		double cc, cf, d, i;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira o custo de f�brica do carro: ");
		cf = leia.nextFloat();
		
		d= (cf * 28) / 100;
		i = (cf * 45) / 100;
		cc = (cf + d + i);
		
		System.out.println("\nO valor do carro � de: "+ cc+ " reais.");
	}

}
