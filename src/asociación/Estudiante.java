/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociación;

/**
 *
 * @author Estudiante
 */
public class Estudiante {
    private int Codigo;
    private String Nombre;
    
    public Estudiante (int Codigo, String Nombre){
        this.Codigo=Codigo;
        this.Nombre=Nombre;
    }
    public String getNombre(){
    return this.Nombre;
}
    public void setNombre(String Nombre){
    this.Nombre=Nombre;
}
    public void setCodigo(int Codigo){
    this.Codigo=Codigo;
}
    public int getCodigo(){
    return this.Codigo;
}
    
}
