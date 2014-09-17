
package model;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.io.IOException;
//import java.util.List;
//import java.util.Hashtable; //nao lembro como usa

public class Perfil {

	public int codigo;
	public boolean ativo; //declara como 'False'
	public String email;
	public String senha;
	public String usuario;
	
	public Perfil(int codigo,boolean ativo, String email, String senha, String usuario) {
		super();
		this.codigo = codigo;
		this.ativo = ativo;
		this.email = email;
		this.senha = senha;
		this.usuario = usuario;
		
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
	
}
