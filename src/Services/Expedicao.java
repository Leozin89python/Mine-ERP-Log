package Services;

import java.util.Date;

import Services.Enum.Status;
public class Expedicao {

	private Status status;
	private String setor;
	private String nome_Responsavel;
	//private Date horario;
	
	public Expedicao() {		
	}
	
	public Expedicao(Status status, String setor, String nome_Responsavel) {
		this.status = status;
		this.setor = setor;
		this.nome_Responsavel = nome_Responsavel;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getNome_Responsavel() {
		return nome_Responsavel;
	}

	public void setNome_Responsavel(String nome_Responsavel) {
		this.nome_Responsavel = nome_Responsavel;
	}

	@Override
	public String toString() {
		return  "================"
				+"\n"
				+"Expedicao:"
				+"\n"
				+"status:"
				+ status
				+"\n"
				+ " setor:" 
				+ setor
				+"\n"
				+ "nome_Responsavel:" 
				+ nome_Responsavel
				+"\n"
				+"================";
	}
	
	
	
	
	
}
