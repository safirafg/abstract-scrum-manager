package Ex;

import java.util.*;

public class Ex4 {
	public static void main (String [] args) {
		
		int x=1, idade=0, genero=0, emocional=0, calmo=0, nervoso=0, hagressivo=0, 
		maiornervosa=0, menorcalmo=0, fnervosa=0, masculino=0, outroc=0;
		
		Scanner leia = new Scanner (System.in);
		
		while (x <=150) {
		
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
			while (idade < 0) {
				System.out.println("Valor inv�lido, tente novamente.");
				idade = leia.nextInt();
			}
			
		
			System.out.println("\nSexo: \n1) Feminino \n2) Masculino \n3) Outros");
			genero = leia.nextInt();
			while (genero < 1 || genero>3) {
				System.out.println("Valor inv�lido, tente novamente.");
				genero = leia.nextInt();
			}
			
			System.out.println("\nComo estava se sentindo: \n1) Calmo(a) \n2) Nervoso(a) \n3) Agressivo(a)");
			emocional = leia.nextInt();
			while (emocional < 1 || emocional>3) {
				System.out.println("Valor inv�lido, tente novamente.");
				emocional = leia.nextInt();
			}
			
			if (emocional == 1) { calmo++;}
			if ( emocional == 1 && genero == 1) {fnervosa++;}
			if ( emocional == 3 && genero == 2) {hagressivo++;}
			if (genero == 3 && emocional == 1) {outroc++;}
			if (idade >= 40 && emocional == 2) {maiornervosa++;}
			if (idade <= 18 && emocional == 1) {menorcalmo++;}
			x++;
		}
		
		System.out.printf("\nO n�mero de pessoas calmas � de: %d", calmo);
		System.out.printf("\nO n�mero de mulheres nervosas � de: %d", fnervosa);
		System.out.printf("\nO n�mero de homens agressivos � de: %d", hagressivo);
		System.out.printf("\nO n�mero de outros calmos � de: %d", outroc);
		System.out.printf("\nO n�mero de pessoas nervosas com mais de 40 anos � de: %d", maiornervosa);
		System.out.printf("\nO n�mero de jovens calmos � de: %d", menorcalmo);
	}	
	

}
