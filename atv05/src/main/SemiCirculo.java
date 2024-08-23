package main;

public class SemiCirculo extends FormaGeometrica {
    final Ponto centro;
    final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    double largura() {
        return 2 * getRaio();
    }

    @Override
    double altura() {
        return getRaio();
    }

    @Override
    double area() {
        return Math.PI * getRaio() * getRaio() / 2;
    }

    @Override
    double perimetro() {
        return Math.PI * getRaio();
    }
}