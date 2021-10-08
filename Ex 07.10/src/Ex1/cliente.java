package Ex1;

import java.text.NumberFormat;

public class cliente {
	
	private String nome;
	private double bonus;
	
	public cliente (String n, double b) {
		this.setNome (n);
		this.setBonus (b);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void ganhaBonus(double percentual) {
		bonus *= 1 + percentual / 100;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(bonus);
		return formatoMoeda;
	}
	
	public void imprimir () {
		System.out.println("\n"+ nome +"\t\t\t" + "Bonus: " + this.formatarMoeda());
	}
}
