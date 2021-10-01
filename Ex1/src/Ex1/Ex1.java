package Ex1;

import java.util.Scanner;

public class Ex1 {
	public static void main (String [] args) {
		double idade, ano, mes, dia, total;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o sua idade: ");
		idade = leia.nextFloat();
		System.out.println("Entre com o mês em que nasceu: ");
		mes = leia.nextFloat();
		System.out.println("Entre com o dia em que nasceu: ");
		dia = leia.nextFloat();
		
		total = ((idade) * 365) + (mes) * 30 + dia;
		
		System.out.println(total);
		
	}

}
