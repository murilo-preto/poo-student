package main;

public class Trapezio extends Quadrilatero {
    Ponto p1, p2, p3, p4;

    public Trapezio(Ponto[] pontos) {
        super(pontos);
        this.p1 = pontos[0];
        this.p2 = pontos[1];
        this.p3 = pontos[2];
        this.p4 = pontos[3];
    }

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this(new Ponto[] { p1, p2, p3, p4 });
    }

    public SegmentoReta baseMenor() {
        return new SegmentoReta(p1, p2);
    }

    public SegmentoReta baseMaior() {
        return new SegmentoReta(p4, p3);
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta retaSuperior = new SegmentoReta(p1, p2);
        SegmentoReta retaInferior = new SegmentoReta(p4, p3);

        return retaSuperior.coeficienteAngular() == retaInferior.coeficienteAngular();
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    @Override
    public double altura() {
        SegmentoReta baseMenor = baseMenor();
        SegmentoReta baseMaior = baseMaior();

        double altura = Math.abs(baseMenor.getP1().getCoordY() - baseMaior.getP1().getCoordY());
        return altura;
    }

    @Override
    public double area() {
        double baseMaior = baseMaior().comprimento();
        double baseMenor = baseMenor().comprimento();
        double altura = altura();
        return (baseMaior + baseMenor) * altura / 2;
    }

    @Override
    public double perimetro() {
        double lado1 = new SegmentoReta(p1, p2).comprimento();
        double lado2 = new SegmentoReta(p2, p3).comprimento();
        double lado3 = new SegmentoReta(p3, p4).comprimento();
        double lado4 = new SegmentoReta(p4, p1).comprimento();
        return lado1 + lado2 + lado3 + lado4;
    }

}