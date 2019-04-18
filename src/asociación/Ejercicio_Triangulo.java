/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociación;
import java.util.*;

public class Ejercicio_Triangulo {


    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        System.out.println("Ingrese coordenadas del punto 1");
        System.out.println("x="); double x1= lectura.nextDouble();
        System.out.println("y="); double y1= lectura.nextDouble();
        System.out.println("Ingrese coordenadas del punto 2");
        System.out.println("x="); double x2= lectura.nextDouble();
        System.out.println("y="); double y2= lectura.nextDouble();
        System.out.println("Ingrese coordenadas del punto 3");
        System.out.println("x="); double x3= lectura.nextDouble();
        System.out.println("y="); double y3= lectura.nextDouble();
        
        Punto punto1 =new Punto(x1,y1);
        Punto punto2 =new Punto(x2,y2);
        Punto punto3 =new Punto(x3,y3);
        Triangulo Rojo =new Triangulo ();
        Rojo.setP1(punto1);
        Rojo.setP2(punto2);
        Rojo.setP3(punto3);
        
        System.out.println("Perimetro:"+ Rojo.Perimetro());
        System.out.println("Area:"+ Rojo.Area());
        System.out.println("Altura con respecto al lado 1-2:"+ Rojo.Altura_12());
        System.out.println("Altura con respecto al lado 1-3:"+ Rojo.Altura_13());
        System.out.println("Altura con respecto al lado 2-3:"+ Rojo.Altura_23());
    }
    
}
