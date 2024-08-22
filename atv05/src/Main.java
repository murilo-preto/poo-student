import main.Ponto;
import main.SegmentoReta;
import main.Triangulo;

public class Main {
    public static void main(String[] args) {
//        System.out.println(new Ponto(0.1, 0.2));

        Ponto p1 = new Ponto(0.2, 0.5);
        Ponto p2 = new Ponto(0.3, 0.1);
        Ponto p3 = new Ponto(0.1, 0.1);

        Ponto[] pontos = {p1, p2, p3};

//        SegmentoReta s1 = new SegmentoReta(p1, p2);
//        System.out.println(s1.comprimento());
//        System.out.println(s1.coeficienteAngular());

        Triangulo t1 = new Triangulo(pontos);
        System.out.println(t1.area());

    }
}
