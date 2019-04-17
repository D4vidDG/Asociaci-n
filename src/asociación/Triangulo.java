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

    public Punto getPx() {
        return px;
    }
    public Punto getPy() {
        return py;
    }
    public Punto getPz() {
        return pz;
    }
    public Color getRelleno() {
        return relleno;
    }
    public Color getLinea() {
        return linea;
    }
    public void setPx(Punto px) {
       
    }
    
    public void setPy(Punto py) {
        this.py = py;
    }
    public void setPz(Punto pz) {
        this.pz = pz;
    }
    public void setRelleno(Color relleno) {
        this.relleno = relleno;
    }
    public void setLinea(Color linea) {
        this.linea = linea;
    }
    /*
    public double Perimetro(Punto p1,Punto p2,Punto p3){
       p1= this.p1;
       p2=this.p2;
       p3=this.p3;
      
    }
*/
} 