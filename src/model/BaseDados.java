package model;
import java.util.ArrayList;
import java.util.List;

import model.Empresa;
import model.Escala;
import model.Pessoa;
import model.FuncionarioEnfermagem;
import model.Perfil;
import model.Setor;

/*Classe que simula um banco de dados*/

public class BaseDados {
	private static BaseDados instancia;
	private List<Pessoa> funcionarios = new ArrayList<Pessoa>();
	private List<FuncionarioEnfermagem> funcionariosEnf = new ArrayList<FuncionarioEnfermagem>(); 
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
			this.funcionarios.add(new Pessoa(0, "Joao", 'M', "98734545", "40400000", "joaoadm@gmail.com", "99817744", "adm"));
			
			this.funcionarios.add(new Pessoa(1, "Maria", 'F', "98734509", "40400000", "mariaresp@gmail.com", "99877044", "responsavel"));
			
			char [][] aux = new char[3][7];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 7; j++) {
					aux [i][j] = ' ';
				}
			}
			
			for (int i = 0; i < 3; i++) {
				this.funcionariosEnf.add(new FuncionarioEnfermagem(i, "funcionario" + i,'F',	"123456789" + i, "40400000", "funcionario" +
						i + "@gmail.com", "8765321" + i,"tec enfermagem", aux));
			}
			
			for (int i = 3; i < 5; i++) {
				this.funcionariosEnf.add(new FuncionarioEnfermagem(i, "funcionario" + i,'M', "123456789" + i, "40400000", "funcionario" + i +
						"@gmail.com", "8765321" + i,"enfermeiro", aux));
			}
			
			//ADICIONAR EMPRESA
			this.empresas.add(new Empresa(0,"HOSPITAL DAS CLINICAS"));
			
			//ADICIONAR SETOR
			this.setores.add(new Setor(0,true,"pediatria","1",this.getEmpresas().get(0),this.getFuncionariosEnf().get(1)));
			this.setores.add(new Setor(1,true,"cardiologia","2",this.getEmpresas().get(0),this.getFuncionariosEnf().get(1)));

		}

	}

	public List<Pessoa> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Pessoa> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<FuncionarioEnfermagem> getFuncionariosEnf() {
		return funcionariosEnf;
	}

	public void setFuncionariosEnf(List<FuncionarioEnfermagem> funcionariosEnf) {
		this.funcionariosEnf = funcionariosEnf;
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
