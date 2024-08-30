package main;

public class SemiCirculo extends FormaGeometrica {
    final Ponto centro;
    final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
        
        if (raio<0) {
            throw new IllegalArgumentException("Circulo deve apresentar raio positivo");
        }
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double largura() {
        return 2 * getRaio();
    }

    @Override
    public double altura() {
        return getRaio();
    }

    @Override
    public double area() {
        return Math.PI * getRaio() * getRaio() / 2;
    }

    @Override
    public double perimetro() {
        return Math.PI * getRaio();
    }
}