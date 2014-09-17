package model;

import java.util.Scanner;

public class MainRoster {

	/**
	 * @param args
	 */
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
				System.out.println(" 0 - Logar");
				System.out.println(" 1 - Adicionar funcionario");
				System.out.println(" 2 - Remover funcionario");
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
		
	}while (opcao != 's');	
	}		
}

