package model;

public class FuncionarioEnfermagem extends Pessoa{
	
	//"S" ou "N" para marcar disponibilidade 
	public String funcao;
	public char [][] turnoDia = new char[3][7]; //coluna: manha, tarde e noite
													//linha: dom,seg,ter,qua,qui,sex,sab
	
		
		public FuncionarioEnfermagem(int codigo, String nome, Character sexo, String cpf, String cep, String email, 
			String celular, String funcao, char[][] turnoDia) {
		// TODO Auto-generated constructor stub
		super(codigo, nome, sexo, cpf, cep, email, celular);
		this.funcao = funcao;
		this.turnoDia = turnoDia;
	}
		
		public String getFuncao() {
			return funcao;
		}

		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}
		
			
		public char[][] getTurnoDia() {
			return turnoDia;
		}
		public void setTurnoDia(char[][] turnoDia) {
			this.turnoDia = turnoDia;
		}

}
