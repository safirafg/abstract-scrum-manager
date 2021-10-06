package Ex;

import java.util.*;

public class Ex3 {
	public static void main (String [] args) {
		
		float idade;
		int menor=0, maior=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.printf("\nInsira sua idade: ");
		idade = leia.nextFloat();
		
		while (idade != 99) {
			
			System.out.printf("\nInsira sua idade: ");
			idade = leia.nextFloat();
			
			if (idade <= 21) {
			menor++;
		}
			else if (idade >= 50) {
			maior++;
			}
		}
		
		System.out.printf("\nO número de pessoas com menos de 21 anos é de: %d", menor);
		System.out.printf("\nO número de pessoas com maior de 50 anos é de: %d", maior);
	}	
}
