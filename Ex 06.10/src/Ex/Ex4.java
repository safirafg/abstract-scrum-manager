package Ex;

import java.util.*;

public class Ex4 {
	public static void main (String [] args) {
		
		float matriz1 [][] = new float [2][2];
		float matriz2 [][] = new float [2][2];	
		float matriz3 [][] = new float [2][2];	
		int x, y, op, n;
		
		Scanner leia = new Scanner (System.in);
		
		for (x=0; x<2;x++) {
			for (y=0; y<2;y++) {
				System.out.println ("\nEntre com o valor da matriz 1: ");
				matriz1[x][y] = leia.nextFloat();
				System.out.println ("\nEntre com o valor da matriz 2: ");
				matriz2[x][y] = leia.nextFloat();
			}
		}
		
		System.out.println ("\n\t\t Menu de op��es:");
		System.out.println ("\n1- Somar as duas matrizes");
		System.out.println ("\n2- Subtrair a primeira matriz da segunda ");
		System.out.println ("\n3- Adicionar uma vari�vel as duas matrizes");
		System.out.println ("\n4- Imprimir as duas matrizes");
		System.out.println ("\nDigite uma op��o: ");
		op = leia.nextInt();
		
		while(op < 1 || op > 4) {
			System.out.println ("\n\t\t Menu de op��es:");
			System.out.println ("\n1- Somar as duas matrizes");
			System.out.println ("\n2- Subtrair a primeira matriz da segunda ");
			System.out.println ("\n3- Adicionar uma vari�vel as duas matrizes");
			System.out.println ("\n4- Imprimir as duas matrizes");
			System.out.println ("\nDigite uma op��o: ");
			op = leia.nextInt();
			
			}
			do {
			switch (op) {
			case 1:
			for (x=0; x<2;x++) {
				for (y=0; y<2;y++) {
					matriz3 [x][y] = matriz1[x][y] + matriz2[x][y];
					System.out.println ("\nSomat�rio: "+ matriz3[x][y]);
				}
			}
			break;
			
			case 2:
				for (x=0; x<2;x++) {
					for (y=0; y<2;y++) {
						matriz3 [x][y] = matriz2[x][y] - matriz1[x][y];
						System.out.println ("\nDiferen�a: "+ matriz3[x][y]);
					}
				}
				break;
				
			case 3:
				System.out.println ("\nEntre com um n�mero: ");
				n = leia.nextInt();
				for (x=0; x<2; x++) {
					for (y=0; y<2; y++) {
						matriz1 [x][y] += n;
						matriz1 [x][y] += n;
						
						System.out.println ("\nMatriz1: "+ matriz1 [x][y]);
						System.out.println ("\nMatriz2: "+ matriz2 [x][y]);
					}
				}
				break;
				
			case 4:
				for (x=0; x<2;x++) {
					for (y=0; y<2;y++) {
						
						System.out.println ("\nMatriz1: "+ matriz1 [x][y]);
						System.out.println ("\nMatriz2: "+ matriz2 [x][y]);
			}}
			break;
			
			default: 
				System.out.println ("\nOp��o Invalida."); }
			
			
			System.out.println ("\n\t\t Menu de op��es:");
			System.out.println ("\n1- Somar as duas matrizes");
			System.out.println ("\n2- Subtrair a primeira matriz da segunda ");
			System.out.println ("\n3- Adicionar uma vari�vel as duas matrizes");
			System.out.println ("\n4- Imprimir as duas matrizes");
			System.out.println ("\n5- Digite 0 para sair.");
			op = leia.nextInt();
			
			}
			
	while(op != 0);
	}
}
