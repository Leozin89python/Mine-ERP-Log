package Controle;

import Controle.Erros;
public class Login {

	//estou com erros de lógica dentro desta classe
	public final String Email1 = "leozin@yahoo.com";
	public final String Email2 = "leo@gmail.com";
	public final String Email3 = "leozin@git.com";
	
	public final String Senha1 = "1234";
	public final String Senha2 = "01457";
	public final String Senha3 = "01001";
	
	public Login() {}		

	public String validaLog1 (String Email1, String Senha1) {
		//Email1 = this.Email1;
		//Senha1 = this.Senha1;
		
		while(Email1 != this.Email1 || Senha1 != this.Senha1 || Email1 != null || Senha1 != null ) {
			throw new Erros("O email e a senha devem ser válidos!");
		}
		
		
		return "Email:" + Email1 +"," + "Senha:" + Senha1;
		
	}
	
	@Override
	public String toString() {
		return validaLog1(Email1,Senha1);
	}		
}
