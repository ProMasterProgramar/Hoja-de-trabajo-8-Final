/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcel
 */
public interface PriorityQ <E extends Comparable<E>> {
    
    public E obtenerPrimero();

	
    public E quitar();

	
    public void agregar(E value);

	
    public boolean vacio();
	
	
    public int tamaño();
	
	
    public void clear();
	
    
}
