package conversorMonedas;

import javax.swing.JOptionPane;


public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"}, 
    			"Seleccion")).toString();
    	
    	String pasar_De="",pasar_a = "",monedaFinal="";
    	
        switch(opcion) {
        case "De Pesos a Dólar":
        	pasar_De="MXN";
    		pasar_a="USD";
    		monedaFinal="Dolares";
        	break;
        	
        case "De Pesos a Euro":
        	pasar_De="MXN";
    		pasar_a="EUR";
    		monedaFinal="Euros";
        	break;
        	
        case "De Pesos a Libras":
        	pasar_De="MXN";
    		pasar_a="GBP";
    		monedaFinal="Libras";
        	break;
        	
        case "De Pesos a Yen":
        	pasar_De="MXN";
    		pasar_a="JPY";
    		monedaFinal="Yen";
        	break;
        	
        case "De Pesos a Won Coreano":
        	pasar_De="MXN";
    		pasar_a="KRW";
    		monedaFinal="Won Coreano";
        	break;    	    	                          
        	
        case "De Dólar a Pesos":
        	pasar_De="USD";
    		pasar_a="MXN";
    		monedaFinal="Pesos";
        	break;
        	
        case "De Euro a Pesos":
        	pasar_De="EUR";
    		pasar_a="MXN";
    		monedaFinal="Pesos";
        	break;
        	
        case "De Libras a Pesos":
        	pasar_De="GBP";
    		pasar_a="MXN";
    		monedaFinal="Pesos";
        	break;
        	
        case "De Yen a Pesos":
        	pasar_De="JPY";
    		pasar_a="MXN";
    		monedaFinal="Pesos";
        	break;
        	
        case "De Won Coreano a Pesos":
        	pasar_De="KRW";
    		pasar_a="MXN";
    		monedaFinal="Pesos";
            break;
        }
        
        monedas.ConsultaConversorAPI(Minput, pasar_De, pasar_a,monedaFinal);
    }
        
}
