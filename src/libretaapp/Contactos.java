package libretaapp;

/**
 *
 *Nos permite crear todos los contactos para poder posteriormente trabajar con ellos en la clase
 * libreta.* @author Severo1996
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Contactos {
    public static int ncontactos=1;
    private int id;
    private String nombre;
    private String apellidos;
    private Grupo grupo;
    
    public Contactos(){
        id=ncontactos;
        ncontactos++;
    }
    
    public Contactos(String nombre,String apellidos){
        id=ncontactos;
        this.nombre=nombre;
        this.apellidos=apellidos;
        ncontactos++;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }

    public int getNcontactos() {
        return ncontactos;
    }

    public void setNcontactos(int ncontactos) {
        Contactos.ncontactos = ncontactos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    
}
