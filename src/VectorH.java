
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
public class VectorH <E extends Comparable<E>> implements PriorityQ<E> {
    
    protected Vector<E> datos;
    
    
    VectorH(){
        datos = new Vector<E>() ;
    
    }
    public VectorH(Vector<E> paciente){
		int i;
		datos = new Vector<E>(paciente.size());
		for(i=0; i<paciente.size(); i++){
			agregar(paciente.get(i));
		}
	}
    
    
    
    protected void bajarRaiz(int raiz){
        
        E value = datos.get(raiz);
        int tamHeap = datos.size();
        
        while (raiz<tamHeap) {
            
            int posHijo = izquierda(raiz);
            if (posHijo < tamHeap){
                
                   if ((derecha(raiz)<tamHeap) && ((datos.get(posHijo+1).compareTo(datos.get(posHijo)))<0)){
                       posHijo = posHijo+1;
                   }
                
                  if ((datos.get(posHijo).compareTo(value))<0){
                      
                      datos.set(raiz,datos.get(posHijo));
                      raiz = posHijo;
                  } else {
                      datos.set(raiz, value);
                       return;
                  
                  }
              } else{
                
                datos.set(raiz, value);
                return;
                }
        
        
        }
  
    
    }
    
    
    
    protected void filtrarse(int hoja){
        
        int padre = padre(hoja);
        E v = datos.get(hoja);
        
        while (hoja> 0 && (v.compareTo(datos.get(padre))<0)){
            datos.set(hoja, datos.get(padre));
            hoja = padre;
            padre = padre(hoja);
        
        }
        datos.set(hoja, v);
    }
    
    
    protected static int derecha(int value) {
       int i = 0;
       
       i = 2*(value+1);
               
       return i; 
        
    }
    
    protected static int izquierda(int value){
        int i = 0;
        
        i = 2*value + 1; 
        return i; 
    
    }
    
    protected static int padre (int value){
        int i =0;
        
        i =(value-1)/2;
        
        return i; 
    
    }
    
    
    

    @Override
    public E obtenerPrimero() {
       return datos.get(0);
    }

    @Override
    public E quitar() {
        		//post: removes and returns the minimum value in priority queue
		E value = obtenerPrimero();
		datos.set(0,datos.get(datos.size()-1));
		datos.setSize(datos.size()-1);
		if(datos.size()>1){bajarRaiz(0);};
		return value;
    }

    @Override
    public void agregar(E value) {
                datos.add(value);
		filtrarse(datos.size()-1);
        
    }

    @Override
    public boolean vacio() {
        return false;
    }

    @Override
    public int tamaño() {
        return datos.size(); 
    }

    @Override
    public void clear() {
      
    }
    
    
}
