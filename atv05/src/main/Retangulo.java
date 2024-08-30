package main;

public class Retangulo extends Paralelogramo {
    Ponto p1, p2, p3, p4;

    public Retangulo(Ponto[] pontos) {
        super(pontos);
        this.p1 = pontos[0];
        this.p2 = pontos[1];
        this.p3 = pontos[2];
        this.p4 = pontos[3];
    }
    
    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        this(new Ponto[]{p1, p2, p3, p4});
    }


    public boolean quadrado() {
        SegmentoReta retaSuperior = new SegmentoReta(p1, p2);
        SegmentoReta retaInferior = new SegmentoReta(p4, p3);
        SegmentoReta retaEsquerda = new SegmentoReta(p1, p4);
        SegmentoReta retaDireita = new SegmentoReta(p2, p3);

        boolean ladosIguais =
                retaSuperior.comprimento() == retaInferior.comprimento() &&
                        retaInferior.comprimento() == retaEsquerda.comprimento() &&
                        retaEsquerda.comprimento() == retaDireita.comprimento();

        return ladosIguais;
    }


    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        boolean angSup, angInf, angDir, angEsq;
        SegmentoReta retaSuperior = new SegmentoReta(p1, p2);
        SegmentoReta retaInferior = new SegmentoReta(p4, p3);
        SegmentoReta retaEsquerda = new SegmentoReta(p1, p4);
        SegmentoReta retaDireita = new SegmentoReta(p2, p3);

        angSup = retaSuperior.coeficienteAngular() == 0;
        angInf = retaInferior.coeficienteAngular() == 0;
        angEsq = retaEsquerda.coeficienteAngular() == Double.POSITIVE_INFINITY;
        angDir = retaDireita.coeficienteAngular() == Double.POSITIVE_INFINITY;

        return angSup && angInf && angDir && angEsq;
    }


}