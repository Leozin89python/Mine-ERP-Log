package Services;

public class Distribuicao {

	private String rotas;
	private String veiculo;
	
	public Distribuicao() {}

	public Distribuicao(String rotas, String veiculo) {
		this.rotas = rotas;
		this.veiculo = veiculo;
	}

	public String getRotas() {
		return rotas;
	}

	public void setRotas(String rotas) {
		this.rotas = rotas;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return  "================"
				+"\n"
				+"Distribuicao:"
				+"\n"
				+ "rotas:" 
				+ rotas + ","
				+"\n"
				+"veiculo:" 
				+ veiculo
				+"\n"
				+"===============";
	}
	
}
