import java.util.Arrays;

public class ComparacaoReferencias {
    public static void main(String[] args){
        int[] a ={1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = a; // 'c' é cópia rasa -> faz refer~encia a 'a'

        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        
        System.out.println(a==c);
        System.out.println(a==b); // Compara a referência (identidade), e não os arrays

        System.out.println(Arrays.equals(a, c));
        System.out.println(Arrays.equals(a, b)); // Compara conteúdo

    }
}
