package model;

public class Administrador extends Pessoa{
	
	public boolean ativo;

	public Administrador(int codigo, String nome, Character sexo, String cpf,String cep, String email, 
			String celular, boolean ativo) {
		// TODO Auto-generated constructor stub
		super(codigo, nome, sexo, cpf, cep, email, celular);
		this.ativo = ativo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
