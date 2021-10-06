package Ex;

import java.util.*;

public class Ex3 {
	public static void main (String [] args) {
		
		int [][] matriz = new int [3][3];
		int maior=0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println ("\nMatriz M[3][3]\n");
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna =0; coluna < 3; coluna++) {
				System.out.printf("\n Insira o elemento M[%d][%d]: ",linha + 1, coluna + 1);
				matriz [linha][coluna] = leia.nextInt();
				if (matriz[linha][coluna] >= 10) {
					maior++;
				}
			}
		}
		System.out.println ("\nA matriz ficou: \n");
		
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("\t %d \t", matriz [linha][coluna]);
			
				}
			System.out.println();	
			
		}
		System.out.printf("\nOs números maiores que 10 são: %d", maior);
	}

}
