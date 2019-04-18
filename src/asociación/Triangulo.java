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
public class Triangulo {
    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Color relleno;
    private Color linea;
    

   

    public Punto getP1() {
        return p1;
    }
    public Punto getP2() {
        return p2;
    }
    public Punto getP3() {
        return p3;
    }
    public Color getRelleno() {
        return relleno;
    }
    public Color getLinea() {
        return linea;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }
    public void setP2(Punto p2) {
        this.p2 = p2;
    }
    public void setP3(Punto p3) {
        this.p3 = p3;
    }
    public void setRelleno(Color relleno) {
        this.relleno = relleno;
    }
    public void setLinea(Color linea) {
        this.linea = linea;
    }

    
    public double Perimetro(){
    double x1=p1.getX();
      double y1=p1.getY();
      double x2=p2.getX();
      double y2=p2.getY();
      double x3=p3.getX();
      double y3=p3.getY();
      
      double linea1=Math.sqrt((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2)));
      double linea2=Math.sqrt((Math.pow((x1-x3), 2))+(Math.pow((y1-y3), 2)));
      double linea3=Math.sqrt((Math.pow((x2-x3), 2))+(Math.pow((y2-y3), 2)));
      return linea1 +linea2 + linea3;
    }

     public double Area (){ 
          double x1=p1.getX();
      double y1=p1.getY();
      double x2=p2.getX();
      double y2=p2.getY();
      double x3=p3.getX();
      double y3=p3.getY();
      
      double linea1=Math.sqrt((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2)));
      double linea2=Math.sqrt((Math.pow((x1-x3), 2))+(Math.pow((y1-y3), 2)));
      double linea3=Math.sqrt((Math.pow((x2-x3), 2))+(Math.pow((y2-y3), 2)));
      double s= Perimetro()/2;
      return Math.sqrt(s*(s-linea1)*(s-linea2)*(s-linea3));
     }
    
    public double Altura_12(){
            double x1=p1.getX();
      double y1=p1.getY();
      double x2=p2.getX();
      double y2=p2.getY();
      double x3=p3.getX();
      double y3=p3.getY();
      
      double linea1=Math.sqrt((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2)));
      double linea2=Math.sqrt((Math.pow((x1-x3), 2))+(Math.pow((y1-y3), 2)));
      double linea3=Math.sqrt((Math.pow((x2-x3), 2))+(Math.pow((y2-y3), 2)));
        return (2*Area())/linea1;
    }
    public double Altura_13(){
    double x1=p1.getX();
      double y1=p1.getY();
      double x2=p2.getX();
      double y2=p2.getY();
      double x3=p3.getX();
      double y3=p3.getY();
      
      double linea1=Math.sqrt((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2)));
      double linea2=Math.sqrt((Math.pow((x1-x3), 2))+(Math.pow((y1-y3), 2)));
      double linea3=Math.sqrt((Math.pow((x2-x3), 2))+(Math.pow((y2-y3), 2)));
        return (2*Area())/linea2;
    }
    public double Altura_23(){
    double x1=p1.getX();
      double y1=p1.getY();
      double x2=p2.getX();
      double y2=p2.getY();
      double x3=p3.getX();
      double y3=p3.getY();
      
      double linea1=Math.sqrt((Math.pow((x1-x2), 2))+(Math.pow((y1-y2), 2)));
      double linea2=Math.sqrt((Math.pow((x1-x3), 2))+(Math.pow((y1-y3), 2)));
      double linea3=Math.sqrt((Math.pow((x2-x3), 2))+(Math.pow((y2-y3), 2)));
        return (2*Area())/linea3;
    }
    
} 