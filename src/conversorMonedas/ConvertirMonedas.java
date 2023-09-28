package conversorMonedas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConsultaConversorAPI(double valor, String pasar_de, String pasar_a,String monedaFinal) {	
		ConversorAPI respuesta = new ConversorAPI();
        String fecha_consulta = ObtenerFecha();
		double moneda = respuesta.get(fecha_consulta, String.valueOf(valor),pasar_de,pasar_a);
		moneda = (double) Math.round((moneda*100d)/100);
		JOptionPane.showMessageDialog(null, "Tienes $"+moneda+" "+monedaFinal);
	}
	
	public String ObtenerFecha() { 
		LocalDate actualDate =LocalDate.now();// obtener la fecha actual
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");//pasar tipo LocalDate a String
		String fecha_formateada = actualDate.format(formatter);
		return fecha_formateada;
	}
	
}