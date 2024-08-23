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

    public SegmentoReta baseMenor(){
        return new SegmentoReta(p1, p2);
    }

    public SegmentoReta baseMaior(){
        return new SegmentoReta(p4, p3);
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        SegmentoReta retaSuperior = new SegmentoReta(p1, p2);
        SegmentoReta retaInferior = new SegmentoReta(p4, p3);

        return retaSuperior.coeficienteAngular()==retaInferior.coeficienteAngular();
    }

    @Override
    double largura() {
        return 0;
    }

    @Override
    double altura() {
        return 0;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    double perimetro() {
        return 0;
    }
}