package controller;

//import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
import java.util.List;


import model.BaseDados;
import model.FuncionarioEnfermagem;

public class FuncionarioEnfermagemBusiness {
BaseDados bd = BaseDados.getInstancia();

String [] dia = new String[7];
String [] turno = new String[3];

	
	public FuncionarioEnfermagemBusiness() {
		super();
	}
	
	public boolean Cadastra (String nome, Character sexo, String cpf, String cep,
			String email, String celular, String funcao, char[][] turnoDia) {
		boolean cadastro = false;
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
		int codigo = funcsEnf.size();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 7; j++) {
				turnoDia [i][j] = ' ';
			}
		}
		FuncionarioEnfermagem funcEnf = new FuncionarioEnfermagem(codigo, nome, sexo, cpf, cep, email, celular, funcao,turnoDia);
		
		if(funcEnf != null){
			funcsEnf.add(funcEnf);
			cadastro = true;
		}
		return cadastro;
	}
	
	public boolean Remove (String cpf){
		boolean delete = false;
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
		
		for (int i = 0; i < funcsEnf.size(); i++) {
			if (funcsEnf.get(i).getCpf().equals(cpf)){
				funcsEnf.remove(i);
				delete = true;
			}
		}
		return delete;
	}
	//rever codigo, para o caso de nao editar todas info
	public boolean Edita(String nome, Character sexo, String cpf, String cep, String email, 
			String celular, String funcao, char[][] turnoDia){
		boolean edite = false;
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
		
		for (int i = 0; i < funcsEnf.size(); i++) {
			if (funcsEnf.get(i).getCpf().equals(cpf)){
				int codigo = funcsEnf.size();
				FuncionarioEnfermagem funcE = new FuncionarioEnfermagem(codigo, nome, sexo, cpf, cep, email, celular, funcao,turnoDia);
				if(funcE != null){
					funcsEnf.set(i, funcE);
					edite = true;
				}
			}
		}
		return edite;
	}
	
	public void Lista (){
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
				
		for (int i = 0; i < funcsEnf.size(); i++) {
			 int codigo = funcsEnf.get(i).getCodigo();
			 String nome = funcsEnf.get(i).getNome();
			 char sexo = funcsEnf.get(i).getSexo();
			 String cpf =  funcsEnf.get(i).getCpf();
			 String cep = funcsEnf.get(i).getCep();
			 String email = funcsEnf.get(i).getEmail();
			 String celular = funcsEnf.get(i).getCelular();
			 String funcao = funcsEnf.get(i).getFuncao(); 
			 System.out.println("########FUNCIONARIO " + i);
			 System.out.println(" " +codigo +" " +nome +" " + sexo+" " + cpf+" " + cep+ " " +email+" " +celular+" " +funcao);
		}
	}
	
	public boolean MarcaHorario(String cpf){
		Scanner scanner = new Scanner(System.in);
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
		char [][]horarios = new char[3][7];
		String [] diaM = new String[7];
		String [] turnoM = new String[3];
		
		for (int h = 0; h < funcsEnf.size(); h++) {
			if (funcsEnf.get(h).getCpf().equals(cpf)){
			System.out.println("########### MARCAR HORARIO ################");
			System.out.println("Informe a sua disponibilidade: S - sim ou N - nao");
			System.out.println("Caso queira encerrar, digite E ");
			System.out.println("###########################################");
			diaM = TabelaDia();
			turnoM = TabelaTurno();
			for (int i = 0; i < 7; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println("Tem disponibilidade de trabalhar " + diaM[i] +
							" pela " + turnoM[j] + "?");
					char resp = scanner.next().charAt(0);
					if (resp == 's' || resp == 'n'){
						horarios[j][i] = resp;
					}else{
						i=7;
						j=3;
					}	
				}
			}
			funcsEnf.get(h).setTurnoDia(horarios);
			return true;
			}
		}
		return false;
	}

	public String[] TabelaTurno(){
			
		//turnos
		turno[0] = "manha";
		turno[1] = "tarde";
		turno[2] = "noite";
		
		return turno;
	}
	public String[] TabelaDia(){	
		//dias da semana
		dia[0] = "Domingo";
		dia[1] = "Segunda";
		dia[2] = "Terca";
		dia[3] = "Quarta";
		dia[4] = "Quinta";
		dia[5] = "Sexta";
		dia[6] = "Sabado";
		
		return dia;
		
	}
	
	public void ListaHorario(String cpf){
		List<FuncionarioEnfermagem> funcsEnf = bd.getFuncionariosEnf();
		char [][]horarios = new char[3][7];
		String [] diaL = new String[7];
		String [] turnoL = new String[3];
		
		for (int h = 0; h < funcsEnf.size(); h++) {
			if (funcsEnf.get(h).getCpf().equals(cpf)){
				horarios = funcsEnf.get(h).getTurnoDia();
				System.out.println("########### HORARIOS MARCADOS COMO DISPONIVEIS################");
				System.out.println("##############################################################");
				diaL = TabelaDia();
				turnoL = TabelaTurno();
				for (int l = 0; l < 7; l++) {
					System.out.print( diaL[l] + "|");
				}
				System.out.println(); 
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 7; j++) {
						if (horarios[i][j] == 's'){
						System.out.print(" Sim |");
						}
						if (horarios[i][j] == 'n'){
							System.out.print(" Nao |");
						}
					}
					System.out.println( turnoL[i]);
				}
		  }
	   }	
   }

}
