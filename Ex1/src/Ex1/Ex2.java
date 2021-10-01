package Ex1;

import java.util.Scanner;

public class Ex2 {
	public static void main (String[] args) {
		double idade, ano, mes, meses, dia, total, dias;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Quandos dias você já viveu? ");
		idade = leia.nextFloat();
		System.out.println("Em que mês você nasceu? ");
		mes = leia.nextFloat();
		System.out.println("Qual o dia em que você nasceu? ");
		dia = leia.nextFloat();
		
		ano = (idade) / 365;
		meses = 12 / (mes);
		dias = dia - 30;
		
		System.out.println("O total de tempo vivido é de "+ ano + " anos, "+ meses+ " meses e "+ dias+ " dias.");
	}
 
}
