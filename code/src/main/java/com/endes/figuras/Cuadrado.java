package com.endes.figuras;

public class Cuadrado extends FiguraGeometrica {
/**
* Lado del cuadrado.
*/
private Punto esquina;                              
private double lado;

public Cuadrado(String nombre, String color, double lado, Punto esquina) {
this.lado = lado;
this.esquina = esquina;
nombre = nombre;
color = color;
}

public double perimetro() {
return 4 * lado;
}

public double area() {
return lado * lado;
}


}
