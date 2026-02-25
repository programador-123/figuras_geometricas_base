package com.endes.figuras;

public class triangulo extends FiguraGeometrica {

private Punto vertice1;
private Punto vertice2;
private Punto vertice3;

public triangulo(String nombre, String color, Punto vertice1, Punto vertice2, Punto vertice3) {
super(nombre, color);
this.vertice1 = vertice1;
this.vertice2 = vertice2;
this.vertice3 = vertice3;
}

@Override
public double area() {
return Math.abs((vertice1.getX() * (vertice2.getY() - vertice3.getY());
}

@Override
public double perimetro() {
// Para otros tipos de triángulos, se necesitarían las
// longitudes de lados.
return vertice1.distancia(vertice2) + vertice2.distancia(vertice3) + vertice3.distancia(vertice1);
}

@Override
public void rotar(double angulos) {
// Implementación de rotación para el triángulo (si es
// necesario)

}

@Override
 public void trasladar(double dx, double dy) {
// Implementación de traslación para el triángulo (si es
 // necesario)
}
}
