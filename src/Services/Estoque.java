package Services;

import Services.Enum.codigo;

public class Estoque {

	private codigo cod;
	private int quantidade;
	
	public Estoque() {
	}

	public Estoque(codigo cod, int quantidade) {
		this.cod = cod;
		this.quantidade = quantidade;
	}

	public codigo getCod() {
		return cod;
	}

	public void setCod(codigo cod) {
		this.cod = cod;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Estoque:" 
				+"\n"
				+"codigo:"
				+cod 
				+"\n"
				+"quantidade:" 
				+ quantidade;
	}		
}
