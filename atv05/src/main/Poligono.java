package main;

public abstract class Poligono extends FormaGeometrica {
    Ponto[] pontos;
    Poligono(Ponto[] pontos) {
        this.pontos = pontos;
    }
}