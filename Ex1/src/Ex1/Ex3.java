package Ex1;

import java.util.Scanner;

public class Ex3 {
	public static void main (String [] args) {
		double horas, minutos, segundos, seg;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a quantidade de segundos: ");
		segundos = leia.nextFloat();
		
		horas = (segundos / 3600);
		minutos = (segundos % 3600) /60;
		seg = (segundos % 3600) % 60;
		
		System.out.println("O tempo do evento é de: " + horas + " horas, " + minutos + " minutos e "+ seg + " segundos");
		
	}

}
