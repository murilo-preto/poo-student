package main;

public class Elipse extends FormaGeometrica {
    final Ponto centro;
    final double semiEixoA;
    final double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        this.centro = centro;
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
        
        if (semiEixoA<0 || semiEixoB<0) {
            throw new IllegalArgumentException("Circulo deve apresentar raio positivo");
        }
    }

    public Ponto getCentro() {
        return this.centro;
    }

    public double getSemiEixoA() {
        return this.semiEixoA;
    }

    public double getSemiEixoB() {
        return this.semiEixoB;
    }

    public double getSemiEixoMenor() {
        return Math.min(getSemiEixoA(), getSemiEixoB());
    }

    public double getSemiEixoMaior() {
        return Math.max(getSemiEixoA(), getSemiEixoB());
    }

    public double circunferencia() {
        double a = getSemiEixoMaior();
        double b = getSemiEixoMenor();
        return 2 * Math.PI * Math.sqrt((a * a + b * b) / 2);
    }

    @Override
    public double largura() {
        return 2 * getSemiEixoMaior();
    }

    @Override
    public double altura() {
        return 2 * getSemiEixoMenor();
    }

    @Override
    public double area() {
        return Math.PI * getSemiEixoMaior() * getSemiEixoMenor();
    }

    @Override
    public double perimetro() {
        return circunferencia();
    }
}
