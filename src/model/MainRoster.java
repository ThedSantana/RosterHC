package model;

import java.util.Scanner;
import controller.FuncionarioBusiness;

public class MainRoster {

	/**
	 * @param args
	 */
//SERA SUBSTITUIDO PELA INTERFACE
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	char opcao;
	Scanner scanner = new Scanner(System.in);
	//MENU
	do{
		char op;
		System.out.println("Digite: e - ENFERMEIRO, a - ADM, s - Sair");
		opcao = scanner.next().charAt(0);
		
		if (opcao == 'e'){
		do{
			System.out.println(" 1 - Adicionar perfil");
			System.out.println(" 2 - Remover perfil");
			System.out.println(" 3 - Logar perfil");//nao implementar agora
			System.out.println(" 4 - Marcar horario");
			System.out.println(" 5 - Listar horario");
			System.out.println(" 6 - Listar escala");
			System.out.println(" 7 - Confirmar horario");
			System.out.println(" s - Sair");
			op = scanner.next().charAt(0);
			
			switch(op){
			case ('4'):
							
				break;
			case ('5'):
				break;
			case ('6'):
				break;
			case ('7'):
				break;
			}
			}while (op != 's');
		}
		
		if (opcao == 'a'){
			do{
				FuncionarioBusiness fb = new FuncionarioBusiness();
				
				System.out.println(" 0 - Logar");
				System.out.println(" 1 - Adicionar funcionario");
				System.out.println(" 2 - Remover funcionario"); //
				System.out.println(" 3 - Editar funcionario");
				System.out.println(" 4 - Listar funcionario");
				System.out.println(" 5 - Adicionar setor");
				System.out.println(" 6 - Desativar setor");
				System.out.println(" 7 - Editar setor");
				System.out.println(" 8 - Listar setor");
				System.out.println(" 9 - Listar escala do mes");
				System.out.println(" s - Sair");
				op = scanner.next().charAt(0);
				
				switch(op){
				case ('1'):
					scanner = new Scanner(System.in);
					fb = new FuncionarioBusiness();
					System.out.println("Informe: nome, sexo (M ou F), cpf, cep, email, celular, funcao");
					 String nome = scanner.nextLine();
					 char sexo = scanner.next().charAt(0);
					 String cpf =  scanner.nextLine();
					 String cep = scanner.nextLine();
					 String email = scanner.nextLine();
					 String celular = scanner.nextLine();
					 String funcao = scanner.nextLine();
					if (fb.Cadastra(nome, sexo, cpf, cep, email, celular, funcao)){
						System.out.println("Funcionario inserido com sucesso!!");
					}
					break;
				case ('2'):
					scanner = new Scanner(System.in);
					fb = new FuncionarioBusiness();
					System.out.println("Informe o cpf: ");
				 	String cpfR =  scanner.nextLine();
				 	if (fb.Remove(cpfR)){
				 		System.out.println("Funcionario removido com sucesso!!");
				 	}
					break;
				case ('3'):
					scanner = new Scanner(System.in);
					fb = new FuncionarioBusiness();
					System.out.println("Informe: nome, sexo (M ou F), cpf, cep, email, celular, funcao");
					 String nomeE = scanner.nextLine();
					 char sexoE = scanner.next().charAt(0);
					 String cpfE =  scanner.nextLine();
					 String cepE = scanner.nextLine();
					 String emailE = scanner.nextLine();
					 String celularE = scanner.nextLine();
					 String funcaoE = scanner.nextLine();
					if (fb.Edita( nomeE, sexoE, cpfE, cepE, emailE, celularE, funcaoE)){
						System.out.println("Funcionario editado com sucesso!!");
					}
					break;
				case ('4'):
					fb = new FuncionarioBusiness();
					fb.Lista();
					break;
				}
				}while (op != 's');
			}
		
	}while (opcao != 's');	
	}		
}

