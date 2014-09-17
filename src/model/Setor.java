package model;

public class Setor {
	public int codigo;
	public boolean ativo;
	public String descricao;
	public String andar;
	public Empresa empresa;
	//cada setor com 1 responsavel
	public Funcionario funcionario;

	
	public Setor(int codigo, boolean ativo, String descricao, String andar,
			Empresa empresa, Funcionario funcionario) {
		super();
		this.codigo = codigo;
		this.ativo = ativo;
		this.descricao = descricao;
		this.andar = andar;
		this.empresa= empresa;
		this.funcionario = funcionario;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getAndar() {
		return andar;
	}
	public void setAndar(String andar) {
		this.andar = andar;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

}
