package Ex;
import java.util.*;
public class Ex2 {
	public static void main (String [] args) {
		
		int a, b, c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nEntre com o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o segundo n�mero: ");
		b = leia.nextInt();
		System.out.println("\nEntre com o terceiro n�mero: ");
		c = leia.nextInt();
		
		if (a >= b && b >= c) {
			System.out.println("\nA ordem crescente �: "+ a+ b+ c);
		}
		else if (a >= c && c >= b) {
			System.out.println("\nA ordem crescente �: "+ a+ c+ b);
		}
		else if (b >= a && a >= c) {
			System.out.println("\nA ordem crescente �: "+ b+ a+ c);
		}
		else if (b >= c && c >= a) {
			System.out.println("\nA ordem crescente �: "+ b+ c+ a);
		}
		else if (c >= a && a >= b) {
			System.out.println("\nA ordem crescente �: "+ c+ a+ b);
		}
		else if (c >= b && b >= a) {
			System.out.println("\nA ordem crescente �: "+ c+ b+ a);
		}
		}
	}


