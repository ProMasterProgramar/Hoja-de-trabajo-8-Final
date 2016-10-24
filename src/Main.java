
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        System.out.println("hola");
        String miArchivito = "C:\\Users\\Marcel\\Documents\\UVG\\Segundo Año\\Segundo semestre\\Algoritmos y Estructura de datos\\Hojas de trabajo\\Hoja de trabajo 8\\HojaDeTrabajo8\\src\\pacientes.txt";
        String[] pacientesN;
        BufferedReader br = new BufferedReader(new FileReader(miArchivito));
	String linea;
        
        Vector<Paciente> lista = new Vector<Paciente>();
        
                try {
			while ((linea = br.readLine()) != null) {
			    pacientesN=linea.split(","); 
			    lista.add(new Paciente(pacientesN[0], pacientesN[1], pacientesN[2]));
			    
			}
			
		} catch (IOException e) {
			
		}
                
        System.out.println("El sistema muestra la lista de los pacientes: \n");
        for(int i=0; i<lista.size(); i++){
             System.out.println(lista.get(i));
	}
        
        System.out.println("El sistema muestra la lista en el orden en que deben ser atendidos los pacientes: \n");
		
		VectorH<Paciente> v = new VectorH<Paciente>(lista);
		int cont = v.tamaño();
		
		for(int i=0; i<cont; i++){
			Paciente pacienteN = v.quitar();
			System.out.println(pacienteN.toString()); 
		}
		
        
        
        
        
        
    }
    
}
