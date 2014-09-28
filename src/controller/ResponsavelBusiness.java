package controller;

import java.util.List;

import model.BaseDados;
import model.Responsavel;

public class ResponsavelBusiness {
BaseDados bd = BaseDados.getInstancia();
	
	public ResponsavelBusiness() {
		super();
	}
	
	public boolean Cadastra (String nome, Character sexo, String cpf,
			 String cep, String email, String celular, String funcao,String inicio,String fim) {

		boolean cadastro = false;
		List<Responsavel> resps = bd.getResponsaveis();
		int codigo = resps.size();
		Responsavel resp = new Responsavel(codigo, nome, sexo, cpf, cep, email, celular, inicio, fim);
		
		if(resp != null){
			resps.add(resp);
			cadastro = true;
		}
		return cadastro;
	}
	
	public boolean Remove (String cpf){
		boolean delete = false;
		List<Responsavel> resps = bd.getResponsaveis();
		
		for (int i = 0; i < resps.size(); i++) {
			if (resps.get(i).getCpf().equals(cpf)){
				resps.remove(i);
				delete = true;
			}
		}
		return delete;
	}
	
	//rever codigo, para o caso de nao editar todas info
//	public boolean Edita(String nome, Character sexo, String cpf, String cep, String email, 
//			String celular, String funcao){
//		boolean edite = false;
//		List<Pessoa> funcs = bd.getFuncionarios();
//		
//		for (int i = 0; i < funcs.size(); i++) {
//			if (funcs.get(i).getCpf().equals(cpf)){
//				int codigo = funcs.size();
//				Pessoa funcE = new Pessoa(codigo, nome, sexo, cpf, cep, email, celular, funcao);
//				if(funcE != null){
//					funcs.set(i, funcE);
//					edite = true;
//				}
//			}
//		}
//		return edite;
//	}
	
	public void Lista (){
		List<Responsavel> resps = bd.getResponsaveis();
				
		for (int i = 0; i < resps.size(); i++) {
			 int codigo = resps.get(i).getCodigo();
			 String nome = resps.get(i).getNome();
			 char sexo = resps.get(i).getSexo();
			 String cpf =  resps.get(i).getCpf();
			 String cep = resps.get(i).getCep();
			 String email = resps.get(i).getEmail();
			 String celular = resps.get(i).getCelular();
			 String inicio = resps.get(i).getInicio();
			 String fim = resps.get(i).getFim();
			 System.out.println("########FUNCIONARIO " + i);
			 System.out.println(" " +codigo +" " +nome +" " + sexo+" " + cpf+" " + cep+ " " +email+" " +celular+" " +inicio+" " +fim);
		}
	}
	

}
