import java.util.ArrayList;

import processing.core.PApplet;
public class Logica {
	private PApplet app = Ejecutable.app;

	public Logica() {
		
	}
	
	public void cargarTxts(){
		String[] texto = app.loadStrings("../data/datos.txt");
		for (int i = 1; i < texto.length; i++) {
			String[] datos = texto[i].split(":");
			int[] datosInt = new int[datos.length];
			for (int j = 0; j < datos.length; j++) {
				datosInt[j] = Integer.parseInt(datos[j]);
			}
		}
	}

}
