import java.text.SimpleDateFormat;
import java.util.Date;


public class Ponto {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date agora = new Date();
	
	public void entrada(Funcionario f){
		f.setEntrada(sdf.format(agora));
	}
	
	public void saida(Funcionario f){
		f.setSaida(sdf.format(agora));
	}
}
