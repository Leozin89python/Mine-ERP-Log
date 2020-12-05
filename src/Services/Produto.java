package Services;

public class Produto {

	
	private String prod;
	private double preco;
	
	public Produto() {}

	public Produto(String prod,double preco) {
		this.prod = prod;
		this.preco = preco;
		
	}

	public String getProd() {
		return prod;
	}

	public void setProd(String prod) {
		this.prod = prod;
	} 
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	} 
	
	@Override
	public String toString() {
		return  "=============="
				+"\n"
				+"Produto:"
				+ prod
				+"\n"
				+"Preco:"
				+preco
				+"\n"
				+ "============";
	}	
}
