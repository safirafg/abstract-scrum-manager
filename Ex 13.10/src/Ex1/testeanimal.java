package Ex1;

public class testeanimal {
	public static void main (String [] args) {
		
		
		
		galinha filo = new galinha ("Fil�", "cacarejos;", "muito r�pido;", 5, 
				 "marron;", "toda branca;");
		filo.imprimirInfo();
		filo.somAnimal(null);
		filo.identifica(null);
		
		System.out.println("\n******************************");
		
		gato bolinho = new gato ("Bolinho", "miados;", "devagar, quase parando;", 2,
				 "tamanho m�dio;", "preta;");
		bolinho.imprimirInfo();
		bolinho.somAnimal(null);
		bolinho.identifica(null);
		
		System.out.println("\n******************************");
		
		vaca mimosa = new vaca ("Mimosa", "mugidos;", "muito devagar;", 4, "d�cil;",
				 "malhado;");
		mimosa.imprimirInfo();
		mimosa.somAnimal(null);
		mimosa.identifica(null);
		
		System.out.println("\n******************************");
	}

}
