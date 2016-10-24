/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcel
 */
public class Paciente implements Comparable<Paciente> {

    public Paciente(String nombre, String descripcion, String codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }
    
    private String nombre;
    private String descripcion;
    private String codigo;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

      public String toString(){
    	String pac= nombre+", "+descripcion+", "+codigo;
    	return pac;
    }
       
    @Override
    public int compareTo(Paciente o) {
        String value = ((Paciente)o).getCodigo();
        return codigo.compareTo(value);
    }

    
    
    
}
