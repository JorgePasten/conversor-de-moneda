package conversorMonedas;
import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

import principal.Principal;



public class ConversorAPI {
	
	 public double get(String dia, String Cantidad_Dinero,String pasar_De, String pasar_a) {
		 double valor_final=0;
		 System.out.println(dia);
		 System.out.println(Cantidad_Dinero);
		 System.out.println(pasar_De);
		 System.out.println(pasar_a);
		
		 try {
			System.out.println("Realizando consulta");	
			URL url = new URL ("https://api.apilayer.com/exchangerates_data/convert?to="+pasar_a+"&from="+pasar_De+"&amount="+Cantidad_Dinero+"&apikey=wSIdZtZe37dtPx7doriTCt7sLqjjLo4X");
			 HttpURLConnection c_api =(HttpURLConnection) url.openConnection();
			 c_api.setRequestMethod("GET");
			 c_api.setRequestProperty("apikey", "wSIdZtZe37dtPx7doriTCt7sLqjjLo4X");
			 
			 if(c_api.getResponseCode()==200) {
				
				//mostrar respuesta
				List information_string= new ArrayList();
				Scanner scanner = new Scanner(url.openStream());
				
				while (scanner.hasNext()) {
					information_string.add(scanner.nextLine());
				}
				scanner.close();
				
			    String valor= (String)information_string.get(12); //Obtiene el valor 
			    valor= valor.replaceAll("\"result\": ",""); //Elimina la palabra y devuelve solo el número
			    valor_final = Double.parseDouble(valor); // pasa el numero a double
				System.out.println("El valor final  es: "+valor_final);								
			   
			    
			 }else {
				 System.out.println("Error de respuesta" +c_api.getResponseCode());
			 }
			 
			 c_api.disconnect();
		 }
		 
		 catch(Exception ex) {
			 
			JOptionPane.showMessageDialog(null,"Fallo conexión con API, intenta mas tarde","Error",JOptionPane.ERROR_MESSAGE);
			Principal intentarDeNuevo= new Principal();
			intentarDeNuevo.iniciar();            
			
		 }
		 
		 return valor_final;
		 		   
	 }
}

