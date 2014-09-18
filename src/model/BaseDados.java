package model;
import java.util.ArrayList;
import java.util.List;

import model.Empresa;
import model.Escala;
import model.Funcionario;
import model.Perfil;
import model.Setor;

/*Classe que simula um banco de dados*/

public class BaseDados {
	private static BaseDados instancia;
	private List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	private List<Empresa> empresas = new ArrayList<Empresa>();
	private List<Perfil> perfis = new ArrayList<Perfil>();
	private List<Escala> escalas = new ArrayList<Escala>();
	private List<Setor> setores = new ArrayList<Setor>();
	
	private BaseDados()
	{
		this.configura();
	}
	
	public static BaseDados getInstancia(){
		if(instancia == null){
			instancia = new BaseDados();
		}

		return instancia;
	}
	
	public void configura() {

		if(this.funcionarios.size() == 0 && this.empresas.size() == 0 && this.setores.size() == 0){
			
			//ADICIONA OS FUNCIONARIOS
			this.funcionarios.add(new Funcionario(0, "Joao", 'M', "98734545", "40400000", "joaoadm@gmail.com", "99817744", "adm"));
			
			this.funcionarios.add(new Funcionario(1, "Maria", 'F', "98734509", "40400000", "mariaresp@gmail.com", "99877044", "responsavel"));
			
			for (int i = 2; i < 4; i++) {
				this.funcionarios.add(new Funcionario(i, "funcionario" + i,'F',	"123456789" + i, "40400000", "funcionario" +
						i + "@gmail.com", "8765321" + i,"tec enfermagem"));
			}
			
			for (int i = 4; i < 7; i++) {
				this.funcionarios.add(new Funcionario(i, "funcionario" + i,'M', "123456789" + i, "40400000", "funcionario" + i +
						"@gmail.com", "8765321" + i,"enfermeiro"));
			}
			
			//ADICIONAR EMPRESA
			this.empresas.add(new Empresa(0,"HOSPITAL DAS CLINICAS"));
			
			//ADICIONAR SETOR
				//ver como definir os valores de empresa e responsavel
			this.setores.add(new Setor(0,true,"pediatria","1",null,null));
			this.setores.add(new Setor(1,true,"cardiologia","2",null,null));

		}

	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(List<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Perfil> getPerfis() {
		return perfis;
	}

	public void setPerfis(List<Perfil> perfis) {
		this.perfis = perfis;
	}

	public List<Escala> getEscalas() {
		return escalas;
	}

	public void setEscalas(List<Escala> escalas) {
		this.escalas = escalas;
	}

	public List<Setor> getSetores() {
		return setores;
	}

	public void setSetores(List<Setor> setores) {
		this.setores = setores;
	}

}
