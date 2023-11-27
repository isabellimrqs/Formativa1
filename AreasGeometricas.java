package model;

public class AreasGeometricas extends Calculo {

    @Override
    public double calcularAreaQuadrado(double lado) {
        double area = lado*lado;
        return area;
    }

    @Override
    public double calcularAreaRetangulo(double ladoa, double ladob) {
        double area = ladoa * ladob;
        return area;
    }

    @Override
    public double calcularAreaTriangulo(double altura, double base) {
        double area = (altura * base)/2;
        return area;
    }

    @Override
    public double calcularAreaCirculo(double raio) {
        double area = 3.14*(raio*raio);
        return area;
    }

    @Override
    public double calcularAreaLonsago(double diagonalMaior, double diagonalMenor) {
        double area = (diagonalMaior*diagonalMenor)/2;
        return area;
    }
}
