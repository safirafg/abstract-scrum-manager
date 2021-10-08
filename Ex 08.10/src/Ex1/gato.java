package Ex1;

public class gato extends animal{
	private String pelo;
	private String cor;
	
	public gato (String nome, String som, String corre, int idade, String pelo, String cor) {
		super (nome, som, corre, idade);
		this.pelo = pelo;
		this.cor = cor;	
	}
	
	public void imprimirInfo () {
		System.out.println("\n\tGato: "+ getNome() + "\n\nProduz: " + getSom() + 
				"\nVelocidade: " + getCorre() + "\nIdade: " + getIdade() + " anos; \nPelagem: " + pelo + "\nCor: " + cor);
	}

}
