package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Controle.Login;
import Controle.Erros;
import Services.Distribuicao;
import Services.Estoque;
import Services.Enum.codigo;;

public class Programa {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List <Login> log = new ArrayList<>();
		List <Distribuicao> dis = new ArrayList<>();
		List <Estoque> stq = new ArrayList<>();
		
		System.out.println("=============");
		System.out.println("===Sistema===");
		System.out.println("=====ERP=====");
		System.out.println("=============");
		System.out.println("");
		
		try	{
				System.out.println("Login:");
				String Email = sc.next();
				System.out.println("Senha:");
				String Senha= sc.next();
				log.add(new Login());
				
			    for(Login pass: log) {
			    	System.out.println(pass.validaLog1(Email, Senha));
			    	}
	   
		}catch(Erros e) {
			System.out.println("Erro:" + e.getMessage());
		}catch(Exception e) {
			System.out.println("Erro:" + e.getMessage());
		}
		
		System.out.println("");
		System.out.println("=============");
		System.out.println("=============");
		System.out.println("=====seja====");
		System.out.println("==bem vindo==");
		System.out.println("===== ;) ====");
		System.out.println("");
	
		System.out.println("");
		System.out.println("escolha o setor:");
		int x = sc.nextInt();
		System.out.println("================");
		System.out.println("1 - Distrib..");
		System.out.println("2 - Estoque");
		System.out.println("3 - Expedi.. ");
		System.out.println("4 - Pessoal ");	
		System.out.println("5 - Produtos");
		System.out.println("================");
		
		
		switch(x) {
		
		case 1:
			System.out.println("1 - Distrib..");
			System.out.println("rota(s):");
			String rotas = sc.next();
			System.out.println("veiculo(s):");
			String veiculo = sc.next();
			dis.add(new Distribuicao(rotas,veiculo));
			for(Distribuicao info: dis) {
				System.out.println(info.toString());
			}
			break;
		case 2:
			System.out.println("2 - Estoque");
			System.out.println("código de prioridade do produto:");
			String cod = sc.next();
			System.out.println("qntdd:");
			int quantidade = sc.nextInt();
			stq.add(new Estoque(codigo.valueOf(cod),quantidade));
			for(Estoque info: stq) {
				System.out.println(info);
			}
			break;
		case 3:
			System.out.println( "3 - Expedi..");
			break;
		case 4:
			System.out.println("4 - Pessoal");
			break;
		case 5:
			System.out.println("5 - Produtos");
			break;
		default:
			System.out.println("Setor desconhecido");
			}	
		
	   
		System.out.println("");
		System.out.println("deseja continuar (s/n)?");
		char resp = sc.next().charAt(0);
		
		while(resp != 'n')	{
			
			System.out.println("");
			System.out.println("escolha o setor:");
			 x = sc.nextInt();
			System.out.println("================");
			System.out.println("1 - Distrib..");
			System.out.println("2 - Estoque");
			System.out.println("3 - Expedi.. ");
			System.out.println("4 - Pessoal ");	
			System.out.println("5 - Produtos");
			System.out.println("================");
			
			
			switch(x) {
			
			case 1:
				System.out.println("1 - Distrib..");
				System.out.println("rota(s):");
				String rotas = sc.next();
				System.out.println("veiculo(s):");
				String veiculo = sc.next();
				dis.add(new Distribuicao(rotas,veiculo));
				for(Distribuicao info: dis) {
					System.out.println(info.toString());
				}
				break;
			case 2:
				System.out.println("2 - Estoque");
				System.out.println("codigo de prioridade do produto:");
				String cod = sc.next();
				System.out.println("qntdd:");
				int quantidade = sc.nextInt();
				stq.add(new Estoque(codigo.valueOf(cod),quantidade));
				for(Estoque info: stq) {
					System.out.println(info);
				}
				break;
			case 3:
				System.out.println( "3 - Expedi..");
				break;
			case 4:
				System.out.println("4 - Pessoal");
				break;
			case 5:
				System.out.println("5 - Produtos");
				break;
			default:
				System.out.println("Setor desconhecido");
				}	
			
			System.out.println("deseja continuar (s/n)?");
			resp = sc.next().charAt(0);
			}
		
		
		sc.close();
	}
}
