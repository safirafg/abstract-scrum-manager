package Ex1;

public class vaca extends animal {
	private String cor;
	private String psico;
	
	public vaca (String nome, String som, String corre, int idade, String psico, String cor) {
		super (nome, som, corre, idade);
		this.cor = cor;
		this.psico = psico;	
	}
	
	public void imprimirInfo () {
		System.out.println("\n\tVaca: "+ getNome() + "\n\nProduz: " + getSom() + 
				"\nVelocidade: " + getCorre() + "\nIdade: " + getIdade() + " anos; \nTemperamento: " + psico + "\nCor: " + cor);
	}
	
	@Override
	public void somAnimal (String somA) {
		System.out.println("\nMuuuuu... muuuu....");
	}
	
	public void identifica (String iden) {
		System.out.println("\n… de fato uma vaca...");
	}
}
