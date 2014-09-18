package controller;

import java.util.List;

import model.BaseDados;
import model.FuncionarioEnfermagem;

public class FuncionarioEnfermagemBusiness {
BaseDados bd = BaseDados.getInstancia();


	
	public FuncionarioEnfermagemBusiness() {
		super();
	}
	
	public boolean Cadastra (String nome, Character sexo, String cpf, String cep,
			String email, String celular, String funcao, char[][] turnoDia) {
		boolean cadastro = false;
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
		int codigo = funcsEnf.size();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++) {
				turnoDia [i][j] = ' ';
			}
		}
		FuncionarioEnfermagem funcEnf = new FuncionarioEnfermagem(codigo, nome, sexo, cpf, cep, email, celular, funcao,turnoDia);
		
		if(funcEnf != null){
			funcsEnf.add(funcEnf);
			cadastro = true;
		}
		return cadastro;
	}
	
	public boolean Remove (String cpf){
		boolean delete = false;
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
		
		for (int i = 0; i < funcsEnf.size(); i++) {
			if (funcsEnf.get(i).getCpf().equals(cpf)){
				funcsEnf.remove(i);
				delete = true;
			}
		}
		return delete;
	}
	//rever codigo, para o caso de nao editar todas info
	public boolean Edita(String nome, Character sexo, String cpf, String cep, String email, 
			String celular, String funcao, char[][] turnoDia){
		boolean edite = false;
		List<FuncionarioEnfermagem> funcs = bd.getFuncionariosEnf();
		
		for (int i = 0; i < funcs.size(); i++) {
			if (funcs.get(i).getCpf().equals(cpf)){
				int codigo = funcs.size();
				FuncionarioEnfermagem funcE = new FuncionarioEnfermagem(codigo, nome, sexo, cpf, cep, email, celular, funcao,turnoDia);
				if(funcE != null){
					funcs.set(i, funcE);
					edite = true;
				}
			}
		}
		return edite;
	}
	
	public void Lista (){
		List<FuncionarioEnfermagem> funcs = bd.getFuncionariosEnf();
				
		for (int i = 0; i < funcs.size(); i++) {
			 int codigo = funcs.get(i).getCodigo();
			 String nome = funcs.get(i).getNome();
			 char sexo = funcs.get(i).getSexo();
			 String cpf =  funcs.get(i).getCpf();
			 String cep = funcs.get(i).getCep();
			 String email = funcs.get(i).getEmail();
			 String celular = funcs.get(i).getCelular();
			 String funcao = funcs.get(i).getFuncao(); 
			 System.out.println("########FUNCIONARIO " + i);
			 System.out.println(" " +codigo +" " +nome +" " + sexo+" " + cpf+" " + cep+ " " +email+" " +celular+" " +funcao);
		}
	}
	

}
