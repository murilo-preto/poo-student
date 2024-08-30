package main;

public class Paralelogramo extends Trapezio {
    Ponto p1, p2, p3, p4;

    public Paralelogramo(Ponto[] pontos) {
        super(pontos);
        this.pontos = pontos;
        this.p1 = pontos[0];
        this.p2 = pontos[1];
        this.p3 = pontos[2];
        this.p4 = pontos[3];
    }
    
    public Paralelogramo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this(new Ponto[]{p1, p2, p3, p4});
    }


    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        boolean vertical, horizontal;
        SegmentoReta retaSuperior = new SegmentoReta(p1, p2);
        SegmentoReta retaInferior = new SegmentoReta(p4, p3);
        SegmentoReta retaEsquerda = new SegmentoReta(p1, p4);
        SegmentoReta retaDireita = new SegmentoReta(p2, p3);

        vertical = retaSuperior.coeficienteAngular() == retaInferior.coeficienteAngular();
        horizontal = retaDireita.coeficienteAngular() == retaEsquerda.coeficienteAngular();

        return vertical && horizontal;
    }

}