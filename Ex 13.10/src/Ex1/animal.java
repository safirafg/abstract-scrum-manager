package Ex1;

public abstract class animal {
	private String nome;
	private String som;
	private String corre;
	private int idade;
	abstract public void somAnimal (String somA);
	abstract public void identifica (String iden);
	
	public animal (String nome, String som, String corre, int idade) {
		super ();
		this.nome = nome;
		this.som = som;
		this.corre = corre;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void somAnimal() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
