package Services;

public class Pessoal {

	private String nome;
	private String setor;
	private String cargo;
	private double salario;
	
	public Pessoal() {}

	public Pessoal(String nome, String setor, String cargo, double salario) {
		this.nome = nome;
		this.setor = setor;
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalario() {
		return salario;
	}
	
	@Override
	public String toString() {
		return  "================"
				+"\n"
				+"Pessoal:"
				+"\n"
				+"nome:"
				+ nome + ""
				+ "\n" 
				+ "setor:" 
				+ setor 
				+ "\n"
				+"cargo:" 
				+ cargo
				+"\n"
				+"salario:"
				+salario
				+"\n"
				+ "===============";
	}
	
}
