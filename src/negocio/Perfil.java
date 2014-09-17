
package negocio;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.io.IOException;
//import java.util.List;
//import java.util.Hashtable; //nao lembro como usa

public class Perfil {

	public int codigo;
	public String email;
	public String senha;
	public String usuario;
	//"S" ou "N" para marcar disponibilidade e "T" ou "F" para confirmacao
	public char [][][] turnoDia = new char[4][3][7]; //cada semana (total 4)
												//coluna: manha, tarde e noite
												//linha: dom,seg,ter,qua,qui,sex,sab
	public Perfil(int codigo,String email, String senha, String usuario,
			char[][][] turnoDia) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
		this.usuario = usuario;
		this.turnoDia = turnoDia;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public char[][][] getTurnoDia() {
		return turnoDia;
	}
	public void setTurnoDia(char[][][] turnoDia) {
		this.turnoDia = turnoDia;
	}
	


}
