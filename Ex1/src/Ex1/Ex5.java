package Ex1;

import java.util.Scanner;

public class Ex5 {
	public static void main (String [] args ) {
		
		double n1, n2, n3, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Insira a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("Insira a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("Insira a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		System.out.println("Sua média final é: "+ media);
	}

}
