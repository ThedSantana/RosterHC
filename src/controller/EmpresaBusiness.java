package controller;

import java.util.List;

import model.Empresa;
import model.BaseDados;

public class EmpresaBusiness {
BaseDados bd = BaseDados.getInstancia();
	
	public EmpresaBusiness() {
		super();
	}
	
	public boolean Cadastra(int codigo, String descricao) {

		boolean cadastro = false;
		List<Empresa> emps = bd.getEmpresas();
		
		Empresa emp = new Empresa(codigo, descricao);
		
		if(emp != null){
			emps.add(emp);
			cadastro = true;
		}
		
		return cadastro;
	}
	
	public boolean Remove (String descricao){
		boolean delete = false;
		List<Empresa> emps = bd.getEmpresas();
		
		for (int i = 0; i < emps.size(); i++) {
			if (emps.get(i).getDescricao().equals(descricao)){
				emps.remove(i);
				delete = true;
			}
		}
		return delete;
	}

}
