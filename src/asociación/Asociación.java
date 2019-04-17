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
public class Asociación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Estudiante e1 = new Estudiante (1,"Juan");
       Estudiante e2 = new Estudiante (1,"David");
       Cursos c1 = new Cursos (1,"POO",3);
       Cursos c2 = new Cursos (1,"Calculo",4);
       
       //Asociación
       c1.setEstudiante (e1);
      c2.setEstudiante (e2);
       
       System.out.println(c1.getEstudiante().getNombre());
       System.out.println(c2.getEstudiante().getNombre());
    }      
    
}
