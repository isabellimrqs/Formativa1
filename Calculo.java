package model;

public abstract class Calculo {

    public abstract double calcularAreaQuadrado(double lado);
    public abstract double calcularAreaRetangulo(double ladoa, double ladob);
    public abstract double calcularAreaTriangulo(double altura, double base);

    public abstract double calcularAreaCirculo(double raio);

    public abstract double calcularAreaLonsago(double diagonaMaior, double diagonalMenor);
}
