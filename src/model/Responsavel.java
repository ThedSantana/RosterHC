package model;

public class Responsavel extends Pessoa{
	
	public String inicio;
	public String fim;
	
		
		public Responsavel(int codigo, String nome, Character sexo, String cpf, String cep, String email, 
			String celular, String inicio,String fim) {
		// TODO Auto-generated constructor stub
		super(codigo, nome, sexo, cpf, cep, email, celular);
		this.inicio = inicio;
		this.fim = fim;
	}


		public String getInicio() {
			return inicio;
		}


		public void setInicio(String inicio) {
			this.inicio = inicio;
		}


		public String getFim() {
			return fim;
		}


		public void setFim(String fim) {
			this.fim = fim;
		}
		
		
}
