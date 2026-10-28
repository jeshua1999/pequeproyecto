/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pequeproyecto;

/**
 *
 * @author USUARIO
 */
public class Persona_1 {
   // Verifica que sea el mismo nombre de tu paquete

    public  String nombre;
    public String apellido;
    public String sexo;
    public String telefono;
    public int edad;
    public String nit;
    public String correo;
    public  String residencia;

    // Constructor
    public Persona_1(String tmpNombre, String tmpApellido, String tmpSexo, String tmpTelefono, int tmpEdad, String tmpNit, String tmpCorreo, String tmpResidencia) {
        this.nombre = tmpNombre;
        this.apellido = tmpApellido;
        this.sexo = tmpSexo;
        this.telefono = tmpTelefono;
        this.edad = tmpEdad;
        this.nit = tmpNit;
        this.correo = tmpCorreo;
        this.residencia = tmpResidencia;
    }

    // Métodos Getters
    public String getnombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public String getSexo(){
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }
    public int getEdad(){
        return edad;
    }
    public String getNit(){
        return nit;
    }
   public String getCorreo(){
       return correo;
   }
   public String getResidencia(){
       return residencia;
   }
   public void setNombre(String tmpNombre){
       this.nombre=tmpNombre;
   }
   public void setApellido(String tmpApellido){
       this.apellido=tmpApellido;
   }
   public void setSexo(String tpmSexo){
       this.sexo=tpmSexo;
   }
   public void setTelefono(String tmpTelefono){
       this.telefono=tmpTelefono;
   }
   public void setEdad(int tmpEdad){
       this.edad=tmpEdad;
   }
   public void setNIt(String tmpNit){
      this.nit=tmpNit;
   }
   public void setCorreo(String tmpCorreo){
       this.correo=tmpCorreo;
   }
   public void setResidencia(String tmpResidencia){
      this.residencia = tmpResidencia;
   }
public void mostrarDatos(){
    System.out.println("nOmbre:"+nombre);
    System.out.println("apellido:"+apellido);
    System.out.println("sexo:"+sexo);
    System.out.println("telefono:"+telefono);
    System.out.println("edad:"+edad);
    System.out.println("nit:"+nit);
    System.out.println("correo"+correo);
    System.out.println("residencia:"+residencia);
}
}
    

