package model;

//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//import java.util.Locale;
//import java.io.IOException;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Escala {
	public int codigo;
	public boolean fechado;
	public String data;
	public String turno;
	public Setor setor;
	public static  List<FuncionarioEnfermagem> listFuncEnf = new ArrayList<FuncionarioEnfermagem>(2);
	
	
	public Escala(int codigo, boolean fechado, String data, String turno,
			Setor setor) {
		super();
		this.codigo = codigo;
		this.fechado = fechado;
		this.data = data;
		this.turno = turno;
		this.setor = setor;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public boolean isFechado() {
		return fechado;
	}


	public void setFechado(boolean fechado) {
		this.fechado = fechado;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public Setor getSetor() {
		return setor;
	}


	public void setSetor(Setor setor) {
		this.setor = setor;
	}


	public static List<FuncionarioEnfermagem> getListFuncEnf() {
		return listFuncEnf;
	}


	public static void setListFuncEnf(List<FuncionarioEnfermagem> listFuncEnf) {
		Escala.listFuncEnf = listFuncEnf;
	}
	
	
//	private int alocateEscala()throws IOException{
//	
//	Locale locale = new Locale("pt","BR");  
//	SimpleDateFormat sdfEntrada = new SimpleDateFormat("yyyy-MM-dd",locale);  
//	sdfEntrada.setLenient(false);  
//	Date date;  
//	try {  
//	       date = sdfEntrada.parse(data);  
//	    GregorianCalendar cal = new GregorianCalendar();  
//	    cal.setTime(date);            
//	    return cal.get(Calendar.DAY_OF_WEEK);  
//	} catch (IOException  e) {  //ParseException
//	        e.printStackTrace();  
//	    return null;              
//	}  
//	}
	
}
