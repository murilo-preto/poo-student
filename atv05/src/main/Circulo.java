package main;

public class Circulo extends Elipse {
    final Ponto centro;
    final double semiEixoA;
    final double semiEixoB;

    public Circulo(Ponto centro, double semiEixoA, double semiEixoB) {
        super(centro, semiEixoA, semiEixoB);
        this.centro = centro;
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
        
        if (semiEixoA<0 || semiEixoB<0) {
            throw new IllegalArgumentException("Circulo deve apresentar raio positivo");
        }

        if (semiEixoA != semiEixoB) {
            throw new IllegalArgumentException("Circulo deve apresentar raio constante");
        }
    }
    
    public Circulo(Ponto centro, double raio) {
        this(centro, raio, raio);
    }


    @Override
    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return semiEixoA;
    }

    @Override
    public double circunferencia() {
        return getRaio() * Math.PI * 2;
    }
}