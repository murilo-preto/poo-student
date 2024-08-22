package main;

public class Triangulo extends Poligono {
    Ponto p1, p2, p3;

    public Triangulo(Ponto[] pontos) {
        super(pontos);
        this.p1 = pontos[0];
        this.p2 = pontos[1];
        this.p3 = pontos[2];
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public Ponto getP3() {
        return p3;
    }

    @Override
    public double largura() {
        return this.p2.getCoordX()-this.p3.getCoordX();
    }

    @Override
    public double altura() {
        return this.p1.getCoordY()-this.p2.getCoordY();
    }

    @Override
    public double area() {
        double x1 = this.p1.getCoordX();
        double y1 = this.p1.getCoordY();

        double x2 = this.p2.getCoordX();
        double y2 = this.p2.getCoordY();

        double x3 = this.p3.getCoordX();
        double y3 = this.p3.getCoordY();

        return Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
    }

    @Override
    public double perimetro() {
        return 0;
    }
}