package main;

public abstract class Quadrilatero extends Poligono {
    Ponto p1, p2, p3, p4;
    public Quadrilatero(Ponto[] pontos) {
        super(pontos);

        this.p1 = pontos[0];
        this.p2 = pontos[1];
        this.p3 = pontos[2];
        this.p4 = pontos[3];
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

    public Ponto getP4() {
        return p4;
    }
}