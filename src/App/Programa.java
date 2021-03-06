package App;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Controle.Login;
import Controle.Erros;
import Services.Distribuicao;
import Services.Estoque;
import Services.Enum.codigo;
import Services.Pessoal;
import Services.Produto;
import Services.Enum.Status;
import Services.Expedicao;

public class Programa {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		List <Login> log = new ArrayList<>();
		List <Distribuicao> dis = new ArrayList<>();
		List <Estoque> stq = new ArrayList<>();
		List <Pessoal> ps = new ArrayList<>();
		List <Produto> pd = new ArrayList<>();
		List <Expedicao> ex = new ArrayList<>();
		
		System.out.println("=============");
		System.out.println("===Sistema===");
		System.out.println("=====ERP=====");
		System.out.println("=============");
		System.out.println("");
		
		try	{
			/*
				System.out.println("Login:");
				String Email = sc.next();
				System.out.println("Senha:");
				String Senha= sc.next();
				log.add(new Login());
				
			    for(Login pass: log) {
			    	System.out.println(pass.validaLog1(Email, Senha));
			    	}
	   
		*/
		
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
			System.out.println("c�digo de prioridade do produto:");
			String cod = sc.next();
			System.out.println("qntdd:");
			int quantidade = sc.nextInt();
			stq.add(new Estoque(codigo.valueOf(cod),quantidade));
			for(Estoque info: stq) {
				System.out.println(info.toString());
			}
			break;
		case 3:
			System.out.println( "3 - Expedi..");
			System.out.println("status:");
			String status = sc.next();
			System.out.println("setor:");
			String setor_Exp = sc.next();
			System.out.println("superior responsavel:");
			String nome_Responsavel = sc.next();
			ex.add(new Expedicao(Status.valueOf(status),setor_Exp,nome_Responsavel));
			for(Expedicao info: ex)	{
				System.out.println(info.toString());
			}
			break;
		case 4:
			System.out.println("4 - Pessoal");
			System.out.println("nome:");
			String nome = sc.next();
			System.out.println("setor:");
			String setor = sc.next();
			System.out.println("cargo:");
			String cargo = sc.next();
			System.out.println("salario:");
			double salario = sc.nextDouble();
			ps.add(new Pessoal(nome,setor,cargo,salario));
			for(Pessoal info : ps )	{
				System.out.println(info.toString());
			}
			break;
		case 5:
			System.out.println("5 - Produtos");
			System.out.println("item:");
			String prod = sc.next();
			System.out.println("valor:");
			double preco = sc.nextDouble();
			pd.add(new Produto(prod,preco));
			for(Produto info: pd) {
				System.out.println(info.toString());
			}
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
				System.out.println("c�digo de prioridade do produto:");
				String cod = sc.next();
				System.out.println("qntdd:");
				int quantidade = sc.nextInt();
				stq.add(new Estoque(codigo.valueOf(cod),quantidade));
				for(Estoque info: stq) {
					System.out.println(info.toString());
				}
				break;
			case 3:
				System.out.println( "3 - Expedi..");
				System.out.println("status:");
				String status = sc.next();
				System.out.println("setor:");
				String setor_Exp = sc.next();
				System.out.println("superior responsavel:");
				String nome_Responsavel = sc.next();
				ex.add(new Expedicao(Status.valueOf(status),setor_Exp,nome_Responsavel));
				for(Expedicao info: ex)	{
					System.out.println(info.toString());
				}
				break;
			case 4:
				System.out.println("4 - Pessoal");
				System.out.println("nome:");
				String nome = sc.next();
				System.out.println("setor:");
				String setor = sc.next();
				System.out.println("cargo:");
				String cargo = sc.next();
				System.out.println("salario:");
				double salario = sc.nextDouble();
				ps.add(new Pessoal(nome,setor,cargo,salario));
				for(Pessoal info : ps )	{
					System.out.println(info.toString());
				}
				break;
			case 5:
				System.out.println("5 - Produtos");
				System.out.println("item:");
				String prod = sc.next();
				System.out.println("valor:");
				double preco = sc.nextDouble();
				pd.add(new Produto(prod,preco));
				for(Produto info: pd) {
					System.out.println(info.toString());
				}
				break;
			default:
				System.out.println("Setor desconhecido");
				}	
			
			System.out.println("deseja continuar (s/n)?");
			resp = sc.next().charAt(0);
			}
		
		}catch(Erros e) {
			System.out.println("Erro:" + e.getMessage());
			
		}catch(InputMismatchException e) {
			
			System.out.println("Erro:" + e.getMessage());
		}
		catch(Exception e) {
			
			System.out.println("Erro:" + e.getMessage());
		}
		
		
		sc.close();
	}
}
