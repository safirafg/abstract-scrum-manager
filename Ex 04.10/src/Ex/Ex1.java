package Ex;
import java.util.*;
public class Ex1 {
	public static void main (String [] args) {
		
		int n1, n2, n3, maior;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.println("\nEntre com o segundo valor: ");
		n2 = leia.nextInt();
		System.out.println("\nEntre com o tercero valor: ");
		n3 = leia.nextInt();
		
		if (n1>n2 && n1>n3) {
			maior = n1;
		}
		else if (n2>n1 && n2>n3){
			maior = n2;
		}
		else { 
			maior = n3;
		}
		
		System.out.printf("\nO maior valor é: "+ maior);	
	}
		
}
