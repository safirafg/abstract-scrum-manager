package Ex2;

public class aviao {
	
	private String comandante;
	private String modelo;
	private String local;
	private String destino;

	
	public aviao (String comandante, String modelo, String local, String destino) {
		this.comandante = comandante;
		this.modelo = modelo;
		this.local = local;
		this.destino = destino;
	}
	
	public void imprimirInfo() {
		System.out.println ("\nA " + comandante + ", piloto do " + modelo + 
				", parte do " + local + " com destino a " + destino); 
	}

	public String getComandante() {
		return comandante;
	}

	public void setComandante(String comandante) {
		this.comandante = comandante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}
