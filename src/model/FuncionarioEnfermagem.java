package model;

public class FuncionarioEnfermagem extends Funcionario{
	
	//"S" ou "N" para marcar disponibilidade 
	public char [][] turnoDia = new char[3][7]; //coluna: manha, tarde e noite
													//linha: dom,seg,ter,qua,qui,sex,sab
	
		
		public FuncionarioEnfermagem(int codigo, String nome, Character sexo, String cpf,
			String endereco, String cep, String email, String telefone, 
			String celular, String funcao, char[][] turnoDia) {
		// TODO Auto-generated constructor stub
		super(codigo, nome, sexo, cpf, cep, email, celular, funcao);
		this.turnoDia = turnoDia;
	}
		
		public char[][] getTurnoDia() {
			return turnoDia;
		}
		public void setTurnoDia(char[][] turnoDia) {
			this.turnoDia = turnoDia;
		}

}
