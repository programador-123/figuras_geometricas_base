package com.endes.figuras;



                            

/**
* Lado del cuadrado.
*/
private Punto esquina;                              
private double lado;


public Cuadrado(String nombre, String color, double lado, Punto esquina) {
super(nombre, color);
this.lado = lado;
this.esquina = esquina;

}

/**
* Calculamos el perimetro del cuadrado.
*/
@Override
public double perimetro() {
return 4 * lado;
}
/**
* Calculamos el area del cuadrado.
*/
@Override
public double area() {
return lado * lado;
}
/**
* Rotamos el cuadrado mediante una serie de ecuasiones.
*/
@Override
public void rotar(double angulos) {
double radianes = Math.toRadians(angulos);
double cos = Math.cos(radianes);
double sin = Math.sin(radianes);
double x = esquina.getX();
double y = esquina.getY();
double nuevoX = x * cos - y * sin;
double nuevoY = x * sin + y * cos;
esquina.setX(nuevoX);
esquina.setY(nuevoY);
}

/**
* Trasladamos el cuadrado del presicion.
*/
@Override
public void trasladar(double dx, double dy) {
double nuevoX = esquina.getX() + dx;
double nuevoY = esquina.getY() + dy;
esquina.setX(nuevoX);
esquina.setY(nuevoY);
}
}
