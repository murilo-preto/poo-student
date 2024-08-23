package main;

public class Circulo extends Elipse {
    final Ponto centro;
    final double raio;

    public Circulo(Ponto centro, double semiEixoA, double semiEixoB) {
        super(centro, semiEixoA, semiEixoB);
        this.centro = centro;

        if (semiEixoA != semiEixoB) {
            throw new IllegalArgumentException("Circulo deve apresentar raio constante");
        }

        this.raio = semiEixoA;
    }

    @Override
    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double circunferencia() {
        return getRaio() * Math.PI * 2;
    }
}