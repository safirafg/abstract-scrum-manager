package Ex2;

public class testeaviao {
	public static void main (String [] args) {
		
		aviao aviao1 = new aviao ("Comandante Maria", "14 bis", "Aéroporto de Guarulhos (GRU)", "Aéroporto de Vitória.");
		
		aviao1.imprimirInfo();
		System.out.println ("\n\t\t\t***VOÔ CANCELADO***");
		aviao1.setComandante("Comandante Carolina");
		aviao1.setModelo("Boeing 747");
		aviao1.imprimirInfo();
		
		aviao aviao2 = new aviao ("Comandante Carolina", "Boeing 747", "Aéroporto de Guarulhos (GRU)", "Aéroporto de Vitória.");
		System.out.println("\n\t\t***Mudança de Comandante e Aéronave!***");
		aviao2.setComandante("Comandante Nascimento");
		aviao2.setModelo("Boeing 747-8");
		aviao2.imprimirInfo();
	}

}
