package com.generation.scrum_manager.classes;
public class Pessoa {
	
	
	private String nome;//Nome do usu�rio
	private String funcao;//função do usu�rio
	private final int codAcesso;//senha do usu�rio
	
	public Pessoa(String nome, String funcao, int codAcesso)
	{
		this.nome= nome;
		this.funcao= funcao;
		this.codAcesso= codAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getCodAcesso() {
		return codAcesso;
	}
	
	
	@Override
	public String toString() {
		return getNome()+ " \nFunção do responsável: " +getFuncao();
	}	
}
