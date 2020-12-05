package Services;

public class Produto {

	
	private String Prod;
	
	public Produto() {}

	public Produto(String prod) {
		Prod = prod;
	}

	public String getProd() {
		return Prod;
	}

	public void setProd(String prod) {
		Prod = prod;
	} 
	
	@Override
	public String toString() {
		return "Produto:"
				+ Prod;
	}
	
}
