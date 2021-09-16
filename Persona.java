/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aunai
 */
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int telefono;
    private String DNI;

    Persona(){
        this.nombre="";
        this.apellido="";
        this.telefono=0;
        this.DNI="";
    }
    Persona(String nom, String ape, int tel, String D){
        this.nombre=nom;
        this.apellido=ape;
        this.telefono=tel;
        this.DNI=D;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

   public abstract String Mostrar();
    public abstract void Alta();
}
