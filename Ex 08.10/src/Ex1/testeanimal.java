package Ex1;

public class testeanimal {
	public static void main (String [] args) {
		
		galinha filo = new galinha ("Filó", "cacarejos;", "muito rápido;", 5, 
				 "marron;", "toda branca;");
		filo.imprimirInfo();
		
		System.out.println("\n******************************");
		
		gato bolinho = new gato ("Bolinho", "miados;", "devagar, quase parando;", 2,
				 "tamanho médio;", "preta;");
		bolinho.imprimirInfo();
		
		System.out.println("\n******************************");
		
		vaca mimosa = new vaca ("Mimosa", "mugidos;", "muito devagar;", 4, "dócil;",
				 "malhado;");
		mimosa.imprimirInfo();
		
		System.out.println("\n******************************");
	}

}
