package Ex2;

public class testeaviao {
	public static void main (String [] args) {
		
		aviao aviao1 = new aviao ("Comandante Maria", "14 bis", "A�roporto de Guarulhos (GRU)", "A�roporto de Vit�ria.");
		
		aviao1.imprimirInfo();
		System.out.println ("\n\t\t\t***VO� CANCELADO***");
		aviao1.setComandante("Comandante Carolina");
		aviao1.setModelo("Boeing 747");
		aviao1.imprimirInfo();
		
		aviao aviao2 = new aviao ("Comandante Carolina", "Boeing 747", "A�roporto de Guarulhos (GRU)", "A�roporto de Vit�ria.");
		System.out.println("\n\t\t***Mudan�a de Comandante e A�ronave!***");
		aviao2.setComandante("Comandante Nascimento");
		aviao2.setModelo("Boeing 747-8");
		aviao2.imprimirInfo();
	}

}
