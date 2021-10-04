package Ex;
import java.util.*;
public class Ex3 {
	public static void main (String [] args) {
		
		int idade;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nInsira sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("\nCategoria: Infântil.");
		}
		else if (idade >= 15 && idade <= 17) {
			System.out.println("\nCategoria: Juvenil.");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println("\nCategoria: Adulto.");
		}
		else {
			System.out.println("\nCategoria: Não encontrada.");
		}
	}

}
