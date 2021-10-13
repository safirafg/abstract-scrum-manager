package Ex1;

public class galinha extends animal{
	private String ovo;
	private String cor;
	
	public galinha (String nome, String som, String corre, int idade, String ovo, String cor) {
		super (nome, som, corre, idade);
		this.ovo = ovo;
		this.cor = cor;
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tGalinha: "+ getNome() + "\n\nProduz: " + getSom() + 
				"\nVelocidade: " + getCorre() + "\nIdade: " + getIdade() + " anos; \nObs: bota ovos cor " + ovo + "\nCor: " + cor);
	}
	
	@Override
	public void somAnimal (String somA) {
		System.out.println("\nCócó.. cocó..");
	}
	
	public void identifica (String iden) {
		System.out.println("\nÉ de fato uma galinha...");
	}
}
