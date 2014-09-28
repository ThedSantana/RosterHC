package model;

public class Pessoa {
	public int codigo;
	public String nome;
	public Character sexo; //F feminino M masculino
	public String cpf;
	public String cep;
	public String email;
	public String celular;
		
	public Pessoa(int codigo, String nome, Character sexo, String cpf,	String cep, String email, 
			String celular) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
		this.cep = cep;
		this.email = email;
		this.celular = celular;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
}
