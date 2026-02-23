package com.endes.figuras;

/*
 * Autor Miguel Ángel Pérez González
 */

public class Circulo extends FiguraGeometrica{
	/**
     * Circulo
     */
	private Punto centro;
	private double radio;
	
	public Circulo(String nombre, String color, Punto centro, double radio) {
		super(nombre, color);
		this.centro = centro;
		this.radio = radio;
	}
	
	@Override
	public double area() {
		double area = Math.PI*(this.radio*this.radio);
	}
	
	@Override
	public double perimetro() {
		double perimetro = this.radio * this.radio;
	}
	
	@Override
	public void rotar(double angulo) {
		double rad = Math.toRadians(angulo);
	    double x = centro.getX();
	    double y = centro.getY();
	    double nuevoX = x * Math.cos(rad) - y * Math.sin(rad);
	    double nuevoY = x * Math.sin(rad) + y * Math.cos(rad);
	    centro.setX(nuevoX);
	    centro.setY(nuevoY);
		System.out.println("Rotando la figura " + nombre + " en " + angulo + " grados.");
	}
	
	@Override
	public void trasladar(double dx, double dy) {
		centro.setX(centro.getX() + dx);
	    centro.setY(centro.getY() + dy);
	}
}
