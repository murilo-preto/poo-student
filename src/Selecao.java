public class Selecao {
    public static void main(String[] args) {
        int a, b;
        a=10;
        b=20;

        if (a==b)
            System.out.println("a==b");
        else if (a<b)
            System.out.println("a<b");
        else
            System.out.println("a!=b");

        int dia = 3;
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            default:
                diaSemana = "invalido";
                break;
        }

        System.out.println(diaSemana);


    }
}
