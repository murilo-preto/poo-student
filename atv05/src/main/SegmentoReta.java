package main;

public class SegmentoReta extends ObjetoGeometrico {
    final Ponto p1;
    final Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Ponto getP1() {
        return this.p1;
    }

    public Ponto getP2() {
        return this.p2;
    }

    public double comprimento(){
        double distX, distY;
        distX = this.p2.getCoordX()-this.p1.getCoordX();
        distY = this.p2.getCoordY()-this.p1.getCoordY();

        return Math.sqrt(distX*distX+distY*distY);
    }

    public double coeficienteAngular(){
        double distX, distY;
        distX = this.p2.getCoordX()-this.p1.getCoordX();
        distY = this.p2.getCoordY()-this.p1.getCoordY();

        if (distX==0){
            return Double.POSITIVE_INFINITY;
        }

        return distY/distX;
    }

    public boolean paralelo(SegmentoReta segReta){
        return this.coeficienteAngular() == segReta.coeficienteAngular();
    }
}