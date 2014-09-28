package controller;


import java.util.List;

import model.Empresa;
import model.Responsavel;
import model.Setor;
import model.BaseDados;

public class SetorBusiness {
BaseDados bd = BaseDados.getInstancia();
	
	public SetorBusiness() {
		super();
	}
	
	public boolean Cadastra(int codigo, boolean ativo, String descricao, String andar,
			Empresa empresa, Responsavel responsavel) {

		boolean cadastro = false;
		List<Setor> sets = bd.getSetores();
		
		Setor set = new Setor(codigo, ativo, descricao, andar, empresa, responsavel);
		
		if(set != null){
			sets.add(set);
			cadastro = true;
		}
		
		return cadastro;
	}
	
	
	public boolean Remove (String descricao, String descEmp){
		boolean delete = false;
		List<Setor> sets = bd.getSetores();
		
		for (int i = 0; i < sets.size(); i++) {
			if (sets.get(i).getDescricao().equals(descricao) && sets.get(i).getEmpresa().getDescricao().equals(descEmp)){
				sets.remove(i);
				delete = true;
			}
		}
		return delete;
	}
}
